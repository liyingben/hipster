/*
 * Copyright 2013 Centro de Investigación en Tecnoloxías da Información (CITIUS).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package es.usc.citius.lab.hipster.function;

import es.usc.citius.lab.hipster.node.Transition;

/**
 * Provides a function to calculate the available transitions that
 * can be applied to a given state.
 *
 * @param <S> type of the state
 * @author Pablo Rodríguez Mier <pablo.rodriguez.mier@usc.es>
 * @author Adrián González Sieira <adrian.gonzalez@usc.es>
 * @version 1.0
 * @since 26/03/2013
 */
public interface TransitionFunction<S> {

    /**
     * Calculates the available transitions that can be applied to a given
     * state.
     *
     * @param current current state
     * @return set of available transitions to other states
     */
    Iterable<? extends Transition<S>> from(S current);
}