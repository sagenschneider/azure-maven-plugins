/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.microsoft.azure.toolkit.lib.appservice.service;

import com.microsoft.azure.toolkit.lib.appservice.model.DiagnosticConfig;

import java.util.Map;

public interface IWebAppDeploymentSlotCreator {

    IWebAppDeploymentSlotCreator withName(String name);

    IWebAppDeploymentSlotCreator withAppSettings(Map<String, String> appSettings);

    IWebAppDeploymentSlotCreator withConfigurationSource(String source);

    IWebAppDeploymentSlotCreator withDiagnosticConfig(DiagnosticConfig diagnosticConfig);

    IWebAppDeploymentSlot commit();
}
