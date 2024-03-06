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

package io.cloudshiftdev.awscdkdsl.services.datazone

import kotlin.Unit
import software.amazon.awscdk.services.datazone.CfnDataSource
import software.amazon.awscdk.services.datazone.CfnDomain

/** The configuration of the data source. */
public inline fun CfnDataSource.setConfiguration(
    block: CfnDataSourceDataSourceConfigurationInputPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSourceDataSourceConfigurationInputPropertyDsl()
    builder.apply(block)
    return setConfiguration(builder.build())
}

/** Specifies whether the business name generation is to be enabled for this data source. */
public inline fun CfnDataSource.setRecommendation(
    block: CfnDataSourceRecommendationConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSourceRecommendationConfigurationPropertyDsl()
    builder.apply(block)
    return setRecommendation(builder.build())
}

/** The schedule of the data source runs. */
public inline fun CfnDataSource.setSchedule(
    block: CfnDataSourceScheduleConfigurationPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDataSourceScheduleConfigurationPropertyDsl()
    builder.apply(block)
    return setSchedule(builder.build())
}

/** The single sign-on details in Amazon DataZone. */
public inline fun CfnDomain.setSingleSignOn(
    block: CfnDomainSingleSignOnPropertyDsl.() -> Unit = {}
) {
    val builder = CfnDomainSingleSignOnPropertyDsl()
    builder.apply(block)
    return setSingleSignOn(builder.build())
}
