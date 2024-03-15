@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.regioninfo

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public open class RegionInfo internal constructor(
  internal override val cdkObject: software.amazon.awscdk.regioninfo.RegionInfo,
) : CdkObject(cdkObject) {
  public open fun adotLambdaLayerArn(
    type: String,
    version: String,
    architecture: String,
  ): String? = unwrap(this).adotLambdaLayerArn(type, version, architecture)

  public open fun appConfigLambdaArn(layerVersion: String): String? =
      unwrap(this).appConfigLambdaArn(layerVersion)

  public open fun appConfigLambdaArn(layerVersion: String, architecture: String): String? =
      unwrap(this).appConfigLambdaArn(layerVersion, architecture)

  public open fun appMeshRepositoryAccount(): String? = unwrap(this).getAppMeshRepositoryAccount()

  public open fun cdkMetadataResourceAvailable(): Boolean =
      unwrap(this).getCdkMetadataResourceAvailable()

  public open fun cloudwatchLambdaInsightsArn(insightsVersion: String): String? =
      unwrap(this).cloudwatchLambdaInsightsArn(insightsVersion)

  public open fun cloudwatchLambdaInsightsArn(insightsVersion: String, architecture: String):
      String? = unwrap(this).cloudwatchLambdaInsightsArn(insightsVersion, architecture)

  public open fun dlcRepositoryAccount(): String? = unwrap(this).getDlcRepositoryAccount()

  public open fun domainSuffix(): String? = unwrap(this).getDomainSuffix()

  public open fun ebsEnvEndpointHostedZoneId(): String? =
      unwrap(this).getEbsEnvEndpointHostedZoneId()

  public open fun elbv2Account(): String? = unwrap(this).getElbv2Account()

  public open fun firehoseCidrBlock(): String? = unwrap(this).getFirehoseCidrBlock()

  public open fun isOptInRegion(): Boolean = unwrap(this).getIsOptInRegion()

  public open fun name(): String = unwrap(this).getName()

  public open fun paramsAndSecretsLambdaLayerArn(version: String, architecture: String): String? =
      unwrap(this).paramsAndSecretsLambdaLayerArn(version, architecture)

  public open fun partition(): String? = unwrap(this).getPartition()

  public open fun s3StaticWebsiteEndpoint(): String? = unwrap(this).getS3StaticWebsiteEndpoint()

  public open fun s3StaticWebsiteHostedZoneId(): String? =
      unwrap(this).getS3StaticWebsiteHostedZoneId()

  public open fun samlSignOnUrl(): String? = unwrap(this).getSamlSignOnUrl()

  public open fun servicePrincipal(service: String): String? =
      unwrap(this).servicePrincipal(service)

  public open fun vpcEndpointServiceNamePrefix(): String? =
      unwrap(this).getVpcEndpointServiceNamePrefix()

  public companion object {
    public fun `get`(name: String): RegionInfo =
        software.amazon.awscdk.regioninfo.RegionInfo.`get`(name).let(RegionInfo::wrap)

    public fun limitedRegionMap(factName: String, partitions: List<String>): Map<String, String> =
        software.amazon.awscdk.regioninfo.RegionInfo.limitedRegionMap(factName, partitions) ?:
        emptyMap()

    public fun regionMap(factName: String): Map<String, String> =
        software.amazon.awscdk.regioninfo.RegionInfo.regionMap(factName) ?: emptyMap()

    public fun regions(): List<RegionInfo> =
        software.amazon.awscdk.regioninfo.RegionInfo.getRegions().map(RegionInfo::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.regioninfo.RegionInfo): RegionInfo =
        RegionInfo(cdkObject)

    internal fun unwrap(wrapped: RegionInfo): software.amazon.awscdk.regioninfo.RegionInfo =
        wrapped.cdkObject
  }
}
