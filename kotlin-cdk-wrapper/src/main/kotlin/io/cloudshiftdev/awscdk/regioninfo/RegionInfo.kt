@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.regioninfo

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Information pertaining to an AWS region.
 *
 * Example:
 *
 * ```
 * // Get the information for "eu-west-1":
 * RegionInfo region = RegionInfo.get("eu-west-1");
 * // Access attributes:
 * region.getS3StaticWebsiteEndpoint();
 * ```
 */
public open class RegionInfo(
  cdkObject: software.amazon.awscdk.regioninfo.RegionInfo,
) : CdkObject(cdkObject) {
  /**
   * The ARN of the ADOT Lambda layer, for the given layer type, version and architecture.
   *
   * @param type the type of the ADOT lambda layer. 
   * @param version the layer version. 
   * @param architecture the Lambda Function architecture (e.g. 'x86_64' or 'arm64'). 
   */
  public open fun adotLambdaLayerArn(
    type: String,
    version: String,
    architecture: String,
  ): String? = unwrap(this).adotLambdaLayerArn(type, version, architecture)

  /**
   * The ARN of the AppConfig Lambda Layer, for the given version.
   *
   * @param layerVersion The layer version (e.g. 2.0.181). 
   * @param architecture The Lambda Function architecture (e.g. 'x86_64' or 'arm64'), defaults to
   * x86_64.
   */
  public open fun appConfigLambdaArn(layerVersion: String): String? =
      unwrap(this).appConfigLambdaArn(layerVersion)

  /**
   * The ARN of the AppConfig Lambda Layer, for the given version.
   *
   * @param layerVersion The layer version (e.g. 2.0.181). 
   * @param architecture The Lambda Function architecture (e.g. 'x86_64' or 'arm64'), defaults to
   * x86_64.
   */
  public open fun appConfigLambdaArn(layerVersion: String, architecture: String): String? =
      unwrap(this).appConfigLambdaArn(layerVersion, architecture)

  /**
   * The ID of the AWS account that owns the public ECR repository that contains the AWS App Mesh
   * Envoy Proxy images in a given region.
   */
  public open fun appMeshRepositoryAccount(): String? = unwrap(this).getAppMeshRepositoryAccount()

  /**
   * Whether the `AWS::CDK::Metadata` CloudFormation Resource is available in this region or not.
   */
  public open fun cdkMetadataResourceAvailable(): Boolean =
      unwrap(this).getCdkMetadataResourceAvailable()

  /**
   * The ARN of the CloudWatch Lambda Insights extension, for the given version.
   *
   * @param insightsVersion the version (e.g. 1.0.98.0). 
   * @param architecture the Lambda Function architecture (e.g. 'x86_64' or 'arm64').
   */
  public open fun cloudwatchLambdaInsightsArn(insightsVersion: String): String? =
      unwrap(this).cloudwatchLambdaInsightsArn(insightsVersion)

  /**
   * The ARN of the CloudWatch Lambda Insights extension, for the given version.
   *
   * @param insightsVersion the version (e.g. 1.0.98.0). 
   * @param architecture the Lambda Function architecture (e.g. 'x86_64' or 'arm64').
   */
  public open fun cloudwatchLambdaInsightsArn(insightsVersion: String, architecture: String):
      String? = unwrap(this).cloudwatchLambdaInsightsArn(insightsVersion, architecture)

  /**
   * The ID of the AWS account that owns the public ECR repository containing the AWS Deep Learning
   * Containers images in this region.
   */
  public open fun dlcRepositoryAccount(): String? = unwrap(this).getDlcRepositoryAccount()

  /**
   * The domain name suffix (e.g: amazonaws.com) for this region.
   */
  public open fun domainSuffix(): String? = unwrap(this).getDomainSuffix()

  /**
   * The hosted zone ID used by Route 53 to alias a EBS environment endpoint in this region (e.g:
   * Z2O1EMRO9K5GLX).
   */
  public open fun ebsEnvEndpointHostedZoneId(): String? =
      unwrap(this).getEbsEnvEndpointHostedZoneId()

  /**
   * The account ID for ELBv2 in this region.
   */
  public open fun elbv2Account(): String? = unwrap(this).getElbv2Account()

  /**
   * The CIDR block used by Amazon Data Firehose servers.
   */
  public open fun firehoseCidrBlock(): String? = unwrap(this).getFirehoseCidrBlock()

  /**
   * Whether the given region is an opt-in region.
   */
  public open fun isOptInRegion(): Boolean = unwrap(this).getIsOptInRegion()

  /**
   *
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The ARN of the Parameters and Secrets Lambda layer for the given lambda architecture.
   *
   * @param version the layer version. 
   * @param architecture the Lambda Function architecture (e.g. 'x86_64' or 'arm64'). 
   */
  public open fun paramsAndSecretsLambdaLayerArn(version: String, architecture: String): String? =
      unwrap(this).paramsAndSecretsLambdaLayerArn(version, architecture)

  /**
   * The name of the ARN partition for this region (e.g: aws).
   */
  public open fun partition(): String? = unwrap(this).getPartition()

  /**
   * The endpoint used by S3 static website hosting in this region (e.g:
   * s3-static-website-us-east-1.amazonaws.com).
   */
  public open fun s3StaticWebsiteEndpoint(): String? = unwrap(this).getS3StaticWebsiteEndpoint()

  /**
   * The hosted zone ID used by Route 53 to alias a S3 static website in this region (e.g:
   * Z2O1EMRO9K5GLX).
   */
  public open fun s3StaticWebsiteHostedZoneId(): String? =
      unwrap(this).getS3StaticWebsiteHostedZoneId()

  /**
   * SAML Sign On URL used by IAM SAML Principals.
   */
  public open fun samlSignOnUrl(): String? = unwrap(this).getSamlSignOnUrl()

  /**
   * (deprecated) The name of the service principal for a given service in this region.
   *
   * * Use `iam.ServicePrincipal.servicePrincipalName()` instead.
   * @param service the service name (e.g: s3.amazonaws.com). 
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun servicePrincipal(service: String): String? =
      unwrap(this).servicePrincipal(service)

  /**
   * The prefix for VPC Endpoint Service names, cn.com.amazonaws.vpce for China regions,
   * com.amazonaws.vpce otherwise.
   */
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
        wrapped.cdkObject as software.amazon.awscdk.regioninfo.RegionInfo
  }
}
