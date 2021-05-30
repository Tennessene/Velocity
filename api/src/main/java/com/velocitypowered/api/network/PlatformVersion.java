/*
 * Copyright (C) 2018 Velocity Contributors
 *
 * The Velocity API is licensed under the terms of the MIT License. For more details,
 * reference the LICENSE file in the api top-level directory.
 */

package com.velocitypowered.api.network;

import com.velocitypowered.api.network.registry.Platform;
import java.util.List;

public interface PlatformVersion {
  Platform platform();

  int protocolVersion();

  List<String> supportedVersions();
}
