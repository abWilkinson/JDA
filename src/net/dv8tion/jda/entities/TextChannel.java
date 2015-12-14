/**
 *    Copyright 2015 Austin Keener & Michael Ritter
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.dv8tion.jda.entities;

import java.util.List;

/**
 * Represents a Discord Text Channel.
 * This should provide all necessary functions for interacting with a channel.
 */
public interface TextChannel
{
    /**
     * The Id of the {@link net.dv8tion.jda.entites.TextChannel TextChannel}. This is typically 18 characters long.
     * @return
     */
    String getId();

    /**
     * The human readable name of the  {@link net.dv8tion.jda.entites.TextChannel TextChannel}.<br>
     * If no name has been set, this returns null.
     *
     * @return
     */
    String getName();

    /**
     * The topic set for the  {@link net.dv8tion.jda.entites.TextChannel TextChannel}.
     * Can also be thought of as the description of this {@link net.dv8tion.jda.entites.TextChannel TextChannel}.<br>
     * If no topic has been set, this returns null.
     *
     * @return
     *      Possibly-null String containing the topic of this {@link net.dv8tion.jda.entities.TextChannel TextChannel}.
     */
    String getTopic();

    /**
     * Returns the {@link net.dv8tion.jda.entities.Guild Guild} that this {@link net.dv8tion.jda.entities.TextChannel TextChannel} is part of.
     *
     * @return
     *      Never-null {@link net.dv8tion.jda.entities.Guild Guild} that this {@link net.dv8tion.jda.entities.TextChannel TextChannel} is part of.
     */
    Guild getGuild();

    /**
     * A List of all {@link net.dv8tion.jda.entities.User Users} that have the {@link net.dv8tion.jda.Permission#MESSAGE_READ}
     * for this {@link net.dv8tion.jda.entities.TextChannel TextChannel}.
     *
     * @return
     *      A List of {@link net.dv8tion.jda.entities.User Users} that can read the messages in this channel.
     */
    List<User> getUsers();

    /**
     * The position the {@link net.dv8tion.jda.entities.TextChannel TextChannel} is displayed at.<br>
     * Useful for displaying a list of {@link net.dv8tion.jda.entities.TextChannel TextChannels}.
     *
     * @return
     *      Zero-based int of position of the {@link net.dv8tion.jda.entities.TextChannel TextChannel}.
     */
    int getPosition();
}
