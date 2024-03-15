@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.regioninfo

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * All standardized fact names.
 *
 * Example:
 *
 * ```
 * public class MyFact implements IFact {
 * public final Object region;
 * public final Object name;
 * public final Object value;
 * }
 * Fact.register(new MyFact());
 * ```
 */
public open class FactName internal constructor(
  internal override val cdkObject: software.amazon.awscdk.regioninfo.FactName,
) : CdkObject(cdkObject) {
  public constructor() : this(software.amazon.awscdk.regioninfo.FactName()
  )

  public companion object {
    public val APPMESH_ECR_ACCOUNT: String =
        software.amazon.awscdk.regioninfo.FactName.APPMESH_ECR_ACCOUNT

    public val CDK_METADATA_RESOURCE_AVAILABLE: String =
        software.amazon.awscdk.regioninfo.FactName.CDK_METADATA_RESOURCE_AVAILABLE

    public val DLC_REPOSITORY_ACCOUNT: String =
        software.amazon.awscdk.regioninfo.FactName.DLC_REPOSITORY_ACCOUNT

    public val DOMAIN_SUFFIX: String = software.amazon.awscdk.regioninfo.FactName.DOMAIN_SUFFIX

    public val EBS_ENV_ENDPOINT_HOSTED_ZONE_ID: String =
        software.amazon.awscdk.regioninfo.FactName.EBS_ENV_ENDPOINT_HOSTED_ZONE_ID

    public val ELBV2_ACCOUNT: String = software.amazon.awscdk.regioninfo.FactName.ELBV2_ACCOUNT

    public val FIREHOSE_CIDR_BLOCK: String =
        software.amazon.awscdk.regioninfo.FactName.FIREHOSE_CIDR_BLOCK

    public val IS_OPT_IN_REGION: String =
        software.amazon.awscdk.regioninfo.FactName.IS_OPT_IN_REGION

    public val PARTITION: String = software.amazon.awscdk.regioninfo.FactName.PARTITION

    public val S3_STATIC_WEBSITE_ENDPOINT: String =
        software.amazon.awscdk.regioninfo.FactName.S3_STATIC_WEBSITE_ENDPOINT

    public val S3_STATIC_WEBSITE_ZONE_53_HOSTED_ZONE_ID: String =
        software.amazon.awscdk.regioninfo.FactName.S3_STATIC_WEBSITE_ZONE_53_HOSTED_ZONE_ID

    public val SAML_SIGN_ON_URL: String =
        software.amazon.awscdk.regioninfo.FactName.SAML_SIGN_ON_URL

    public val VPC_ENDPOINT_SERVICE_NAME_PREFIX: String =
        software.amazon.awscdk.regioninfo.FactName.VPC_ENDPOINT_SERVICE_NAME_PREFIX

    public fun adotLambdaLayer(
      type: String,
      version: String,
      architecture: String,
    ): String = software.amazon.awscdk.regioninfo.FactName.adotLambdaLayer(type, version,
        architecture)

    public fun appConfigLambdaLayerVersion(version: String): String =
        software.amazon.awscdk.regioninfo.FactName.appConfigLambdaLayerVersion(version)

    public fun appConfigLambdaLayerVersion(version: String, arch: String): String =
        software.amazon.awscdk.regioninfo.FactName.appConfigLambdaLayerVersion(version, arch)

    public fun cloudwatchLambdaInsightsVersion(version: String): String =
        software.amazon.awscdk.regioninfo.FactName.cloudwatchLambdaInsightsVersion(version)

    public fun cloudwatchLambdaInsightsVersion(version: String, arch: String): String =
        software.amazon.awscdk.regioninfo.FactName.cloudwatchLambdaInsightsVersion(version, arch)

    public fun paramsAndSecretsLambdaLayer(version: String, architecture: String): String =
        software.amazon.awscdk.regioninfo.FactName.paramsAndSecretsLambdaLayer(version,
        architecture)

    public fun servicePrincipal(service: String): String =
        software.amazon.awscdk.regioninfo.FactName.servicePrincipal(service)

    internal fun wrap(cdkObject: software.amazon.awscdk.regioninfo.FactName): FactName =
        FactName(cdkObject)

    internal fun unwrap(wrapped: FactName): software.amazon.awscdk.regioninfo.FactName =
        wrapped.cdkObject
  }
}
