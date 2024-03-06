@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.inspectorv2

import kotlin.Unit
import software.amazon.awscdk.services.inspectorv2.CfnCisScanConfiguration
import software.amazon.awscdk.services.inspectorv2.CfnFilter

/** The CIS scan configuration's schedule. */
public inline fun CfnCisScanConfiguration.setSchedule(
    block: CfnCisScanConfigurationSchedulePropertyDsl.() -> Unit = {}
) {
    val builder = CfnCisScanConfigurationSchedulePropertyDsl()
    builder.apply(block)
    return setSchedule(builder.build())
}

/** The CIS scan configuration's targets. */
public inline fun CfnCisScanConfiguration.setTargets(
    block: CfnCisScanConfigurationCisTargetsPropertyDsl.() -> Unit = {}
) {
    val builder = CfnCisScanConfigurationCisTargetsPropertyDsl()
    builder.apply(block)
    return setTargets(builder.build())
}

/** Details on the filter criteria associated with this filter. */
public inline fun CfnFilter.setFilterCriteria(
    block: CfnFilterFilterCriteriaPropertyDsl.() -> Unit = {}
) {
    val builder = CfnFilterFilterCriteriaPropertyDsl()
    builder.apply(block)
    return setFilterCriteria(builder.build())
}
