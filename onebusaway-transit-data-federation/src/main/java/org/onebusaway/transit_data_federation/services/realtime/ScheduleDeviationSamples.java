/**
 * Copyright (C) 2011 Brian Ferris <bdferris@onebusaway.org>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onebusaway.transit_data_federation.services.realtime;

public class ScheduleDeviationSamples {

  private final double[] scheduleTimes;
  private final double[] scheduleDeviationMus;
  private final double[] scheduleDeviationSigmas;

  public ScheduleDeviationSamples(double[] scheduleTimes,
      double[] scheduleDeviationMus, double[] scheduleDeviationSigmas) {
    this.scheduleTimes = scheduleTimes;
    this.scheduleDeviationMus = scheduleDeviationMus;
    this.scheduleDeviationSigmas = scheduleDeviationSigmas;
  }

  public double[] getScheduleTimes() {
    return scheduleTimes;
  }

  public double[] getScheduleDeviationMus() {
    return scheduleDeviationMus;
  }

  public double[] getScheduleDeviationSigmas() {
    return scheduleDeviationSigmas;
  }

  public boolean isEmpty() {
    return scheduleTimes.length == 0;
  }
}