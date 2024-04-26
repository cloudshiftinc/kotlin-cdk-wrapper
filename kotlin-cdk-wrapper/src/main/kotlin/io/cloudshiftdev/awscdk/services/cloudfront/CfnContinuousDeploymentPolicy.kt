@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a continuous deployment policy that routes a subset of production traffic from a primary
 * distribution to a staging distribution.
 *
 * After you create and update a staging distribution, you can use a continuous deployment policy to
 * incrementally move traffic to the staging distribution. This enables you to test changes to a
 * distribution's configuration before moving all of your production traffic to the new configuration.
 *
 * For more information, see [Using CloudFront continuous deployment to safely test CDN
 * configuration
 * changes](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/continuous-deployment.html)
 * in the *Amazon CloudFront Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cloudfront.*;
 * CfnContinuousDeploymentPolicy cfnContinuousDeploymentPolicy =
 * CfnContinuousDeploymentPolicy.Builder.create(this, "MyCfnContinuousDeploymentPolicy")
 * .continuousDeploymentPolicyConfig(ContinuousDeploymentPolicyConfigProperty.builder()
 * .enabled(false)
 * .stagingDistributionDnsNames(List.of("stagingDistributionDnsNames"))
 * // the properties below are optional
 * .singleHeaderPolicyConfig(SingleHeaderPolicyConfigProperty.builder()
 * .header("header")
 * .value("value")
 * .build())
 * .singleWeightPolicyConfig(SingleWeightPolicyConfigProperty.builder()
 * .weight(123)
 * // the properties below are optional
 * .sessionStickinessConfig(SessionStickinessConfigProperty.builder()
 * .idleTtl(123)
 * .maximumTtl(123)
 * .build())
 * .build())
 * .trafficConfig(TrafficConfigProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .singleHeaderConfig(SingleHeaderConfigProperty.builder()
 * .header("header")
 * .value("value")
 * .build())
 * .singleWeightConfig(SingleWeightConfigProperty.builder()
 * .weight(123)
 * // the properties below are optional
 * .sessionStickinessConfig(SessionStickinessConfigProperty.builder()
 * .idleTtl(123)
 * .maximumTtl(123)
 * .build())
 * .build())
 * .build())
 * .type("type")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-continuousdeploymentpolicy.html)
 */
public open class CfnContinuousDeploymentPolicy(
  cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnContinuousDeploymentPolicyProps,
  ) :
      this(software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnContinuousDeploymentPolicyProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnContinuousDeploymentPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnContinuousDeploymentPolicyProps(props)
  )

  /**
   * The identifier of the cotinuous deployment policy.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The date and time when the continuous deployment policy was last modified.
   */
  public open fun attrLastModifiedTime(): String = unwrap(this).getAttrLastModifiedTime()

  /**
   * Contains the configuration for a continuous deployment policy.
   */
  public open fun continuousDeploymentPolicyConfig(): Any =
      unwrap(this).getContinuousDeploymentPolicyConfig()

  /**
   * Contains the configuration for a continuous deployment policy.
   */
  public open fun continuousDeploymentPolicyConfig(`value`: IResolvable) {
    unwrap(this).setContinuousDeploymentPolicyConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Contains the configuration for a continuous deployment policy.
   */
  public open
      fun continuousDeploymentPolicyConfig(`value`: ContinuousDeploymentPolicyConfigProperty) {
    unwrap(this).setContinuousDeploymentPolicyConfig(`value`.let(ContinuousDeploymentPolicyConfigProperty::unwrap))
  }

  /**
   * Contains the configuration for a continuous deployment policy.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cf14f33ea5dfd05cab983d82d38ad11339d4023d2d17e81b9b7cfa73647c4afe")
  public open
      fun continuousDeploymentPolicyConfig(`value`: ContinuousDeploymentPolicyConfigProperty.Builder.() -> Unit):
      Unit = continuousDeploymentPolicyConfig(ContinuousDeploymentPolicyConfigProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Contains the configuration for a continuous deployment policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-continuousdeploymentpolicy.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig)
     * @param continuousDeploymentPolicyConfig Contains the configuration for a continuous
     * deployment policy. 
     */
    public fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: IResolvable)

    /**
     * Contains the configuration for a continuous deployment policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-continuousdeploymentpolicy.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig)
     * @param continuousDeploymentPolicyConfig Contains the configuration for a continuous
     * deployment policy. 
     */
    public
        fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: ContinuousDeploymentPolicyConfigProperty)

    /**
     * Contains the configuration for a continuous deployment policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-continuousdeploymentpolicy.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig)
     * @param continuousDeploymentPolicyConfig Contains the configuration for a continuous
     * deployment policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02aec362a43d44818e6bc8847a1309a63040670369a0299060c34fe44c82b1fa")
    public
        fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: ContinuousDeploymentPolicyConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.Builder =
        software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.Builder.create(scope,
        id)

    /**
     * Contains the configuration for a continuous deployment policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-continuousdeploymentpolicy.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig)
     * @param continuousDeploymentPolicyConfig Contains the configuration for a continuous
     * deployment policy. 
     */
    override fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: IResolvable) {
      cdkBuilder.continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig.let(IResolvable::unwrap))
    }

    /**
     * Contains the configuration for a continuous deployment policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-continuousdeploymentpolicy.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig)
     * @param continuousDeploymentPolicyConfig Contains the configuration for a continuous
     * deployment policy. 
     */
    override
        fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: ContinuousDeploymentPolicyConfigProperty) {
      cdkBuilder.continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig.let(ContinuousDeploymentPolicyConfigProperty::unwrap))
    }

    /**
     * Contains the configuration for a continuous deployment policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-continuousdeploymentpolicy.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig)
     * @param continuousDeploymentPolicyConfig Contains the configuration for a continuous
     * deployment policy. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02aec362a43d44818e6bc8847a1309a63040670369a0299060c34fe44c82b1fa")
    override
        fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: ContinuousDeploymentPolicyConfigProperty.Builder.() -> Unit):
        Unit =
        continuousDeploymentPolicyConfig(ContinuousDeploymentPolicyConfigProperty(continuousDeploymentPolicyConfig))

    public fun build(): software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnContinuousDeploymentPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnContinuousDeploymentPolicy(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy):
        CfnContinuousDeploymentPolicy = CfnContinuousDeploymentPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnContinuousDeploymentPolicy):
        software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy = wrapped.cdkObject
        as software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy
  }

  /**
   * Contains the configuration for a continuous deployment policy.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * ContinuousDeploymentPolicyConfigProperty continuousDeploymentPolicyConfigProperty =
   * ContinuousDeploymentPolicyConfigProperty.builder()
   * .enabled(false)
   * .stagingDistributionDnsNames(List.of("stagingDistributionDnsNames"))
   * // the properties below are optional
   * .singleHeaderPolicyConfig(SingleHeaderPolicyConfigProperty.builder()
   * .header("header")
   * .value("value")
   * .build())
   * .singleWeightPolicyConfig(SingleWeightPolicyConfigProperty.builder()
   * .weight(123)
   * // the properties below are optional
   * .sessionStickinessConfig(SessionStickinessConfigProperty.builder()
   * .idleTtl(123)
   * .maximumTtl(123)
   * .build())
   * .build())
   * .trafficConfig(TrafficConfigProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .singleHeaderConfig(SingleHeaderConfigProperty.builder()
   * .header("header")
   * .value("value")
   * .build())
   * .singleWeightConfig(SingleWeightConfigProperty.builder()
   * .weight(123)
   * // the properties below are optional
   * .sessionStickinessConfig(SessionStickinessConfigProperty.builder()
   * .idleTtl(123)
   * .maximumTtl(123)
   * .build())
   * .build())
   * .build())
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig.html)
   */
  public interface ContinuousDeploymentPolicyConfigProperty {
    /**
     * A Boolean that indicates whether this continuous deployment policy is enabled (in effect).
     *
     * When this value is `true` , this policy is enabled and in effect. When this value is `false`
     * , this policy is not enabled and has no effect.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig-enabled)
     */
    public fun enabled(): Any

    /**
     * This configuration determines which HTTP requests are sent to the staging distribution.
     *
     * If the HTTP request contains a header and value that matches what you specify here, the
     * request is sent to the staging distribution. Otherwise the request is sent to the primary
     * distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig-singleheaderpolicyconfig)
     */
    public fun singleHeaderPolicyConfig(): Any? = unwrap(this).getSingleHeaderPolicyConfig()

    /**
     * This configuration determines the percentage of HTTP requests that are sent to the staging
     * distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig-singleweightpolicyconfig)
     */
    public fun singleWeightPolicyConfig(): Any? = unwrap(this).getSingleWeightPolicyConfig()

    /**
     * The CloudFront domain name of the staging distribution.
     *
     * For example: `d111111abcdef8.cloudfront.net` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig-stagingdistributiondnsnames)
     */
    public fun stagingDistributionDnsNames(): List<String>

    /**
     * Contains the parameters for routing production traffic from your primary to staging
     * distributions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig-trafficconfig)
     */
    public fun trafficConfig(): Any? = unwrap(this).getTrafficConfig()

    /**
     * The type of traffic configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig-type)
     */
    public fun type(): String? = unwrap(this).getType()

    /**
     * A builder for [ContinuousDeploymentPolicyConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled A Boolean that indicates whether this continuous deployment policy is
       * enabled (in effect). 
       * When this value is `true` , this policy is enabled and in effect. When this value is
       * `false` , this policy is not enabled and has no effect.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled A Boolean that indicates whether this continuous deployment policy is
       * enabled (in effect). 
       * When this value is `true` , this policy is enabled and in effect. When this value is
       * `false` , this policy is not enabled and has no effect.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param singleHeaderPolicyConfig This configuration determines which HTTP requests are sent
       * to the staging distribution.
       * If the HTTP request contains a header and value that matches what you specify here, the
       * request is sent to the staging distribution. Otherwise the request is sent to the primary
       * distribution.
       */
      public fun singleHeaderPolicyConfig(singleHeaderPolicyConfig: IResolvable)

      /**
       * @param singleHeaderPolicyConfig This configuration determines which HTTP requests are sent
       * to the staging distribution.
       * If the HTTP request contains a header and value that matches what you specify here, the
       * request is sent to the staging distribution. Otherwise the request is sent to the primary
       * distribution.
       */
      public
          fun singleHeaderPolicyConfig(singleHeaderPolicyConfig: SingleHeaderPolicyConfigProperty)

      /**
       * @param singleHeaderPolicyConfig This configuration determines which HTTP requests are sent
       * to the staging distribution.
       * If the HTTP request contains a header and value that matches what you specify here, the
       * request is sent to the staging distribution. Otherwise the request is sent to the primary
       * distribution.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3726686afad905a9ae332c59666b4e79992e2ef6b09a46c71eae50b0f2b1baba")
      public
          fun singleHeaderPolicyConfig(singleHeaderPolicyConfig: SingleHeaderPolicyConfigProperty.Builder.() -> Unit)

      /**
       * @param singleWeightPolicyConfig This configuration determines the percentage of HTTP
       * requests that are sent to the staging distribution.
       */
      public fun singleWeightPolicyConfig(singleWeightPolicyConfig: IResolvable)

      /**
       * @param singleWeightPolicyConfig This configuration determines the percentage of HTTP
       * requests that are sent to the staging distribution.
       */
      public
          fun singleWeightPolicyConfig(singleWeightPolicyConfig: SingleWeightPolicyConfigProperty)

      /**
       * @param singleWeightPolicyConfig This configuration determines the percentage of HTTP
       * requests that are sent to the staging distribution.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b409a905c8af0d9da494ea94eba46db86e04d8aa819d02c56fff7a470b36020b")
      public
          fun singleWeightPolicyConfig(singleWeightPolicyConfig: SingleWeightPolicyConfigProperty.Builder.() -> Unit)

      /**
       * @param stagingDistributionDnsNames The CloudFront domain name of the staging distribution. 
       * For example: `d111111abcdef8.cloudfront.net` .
       */
      public fun stagingDistributionDnsNames(stagingDistributionDnsNames: List<String>)

      /**
       * @param stagingDistributionDnsNames The CloudFront domain name of the staging distribution. 
       * For example: `d111111abcdef8.cloudfront.net` .
       */
      public fun stagingDistributionDnsNames(vararg stagingDistributionDnsNames: String)

      /**
       * @param trafficConfig Contains the parameters for routing production traffic from your
       * primary to staging distributions.
       */
      public fun trafficConfig(trafficConfig: IResolvable)

      /**
       * @param trafficConfig Contains the parameters for routing production traffic from your
       * primary to staging distributions.
       */
      public fun trafficConfig(trafficConfig: TrafficConfigProperty)

      /**
       * @param trafficConfig Contains the parameters for routing production traffic from your
       * primary to staging distributions.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1f18d10221ae381cfb3f3c1e0759c5ead3f14d94b734e082cce12fa39f182e9")
      public fun trafficConfig(trafficConfig: TrafficConfigProperty.Builder.() -> Unit)

      /**
       * @param type The type of traffic configuration.
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty.builder()

      /**
       * @param enabled A Boolean that indicates whether this continuous deployment policy is
       * enabled (in effect). 
       * When this value is `true` , this policy is enabled and in effect. When this value is
       * `false` , this policy is not enabled and has no effect.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled A Boolean that indicates whether this continuous deployment policy is
       * enabled (in effect). 
       * When this value is `true` , this policy is enabled and in effect. When this value is
       * `false` , this policy is not enabled and has no effect.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param singleHeaderPolicyConfig This configuration determines which HTTP requests are sent
       * to the staging distribution.
       * If the HTTP request contains a header and value that matches what you specify here, the
       * request is sent to the staging distribution. Otherwise the request is sent to the primary
       * distribution.
       */
      override fun singleHeaderPolicyConfig(singleHeaderPolicyConfig: IResolvable) {
        cdkBuilder.singleHeaderPolicyConfig(singleHeaderPolicyConfig.let(IResolvable::unwrap))
      }

      /**
       * @param singleHeaderPolicyConfig This configuration determines which HTTP requests are sent
       * to the staging distribution.
       * If the HTTP request contains a header and value that matches what you specify here, the
       * request is sent to the staging distribution. Otherwise the request is sent to the primary
       * distribution.
       */
      override
          fun singleHeaderPolicyConfig(singleHeaderPolicyConfig: SingleHeaderPolicyConfigProperty) {
        cdkBuilder.singleHeaderPolicyConfig(singleHeaderPolicyConfig.let(SingleHeaderPolicyConfigProperty::unwrap))
      }

      /**
       * @param singleHeaderPolicyConfig This configuration determines which HTTP requests are sent
       * to the staging distribution.
       * If the HTTP request contains a header and value that matches what you specify here, the
       * request is sent to the staging distribution. Otherwise the request is sent to the primary
       * distribution.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3726686afad905a9ae332c59666b4e79992e2ef6b09a46c71eae50b0f2b1baba")
      override
          fun singleHeaderPolicyConfig(singleHeaderPolicyConfig: SingleHeaderPolicyConfigProperty.Builder.() -> Unit):
          Unit =
          singleHeaderPolicyConfig(SingleHeaderPolicyConfigProperty(singleHeaderPolicyConfig))

      /**
       * @param singleWeightPolicyConfig This configuration determines the percentage of HTTP
       * requests that are sent to the staging distribution.
       */
      override fun singleWeightPolicyConfig(singleWeightPolicyConfig: IResolvable) {
        cdkBuilder.singleWeightPolicyConfig(singleWeightPolicyConfig.let(IResolvable::unwrap))
      }

      /**
       * @param singleWeightPolicyConfig This configuration determines the percentage of HTTP
       * requests that are sent to the staging distribution.
       */
      override
          fun singleWeightPolicyConfig(singleWeightPolicyConfig: SingleWeightPolicyConfigProperty) {
        cdkBuilder.singleWeightPolicyConfig(singleWeightPolicyConfig.let(SingleWeightPolicyConfigProperty::unwrap))
      }

      /**
       * @param singleWeightPolicyConfig This configuration determines the percentage of HTTP
       * requests that are sent to the staging distribution.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b409a905c8af0d9da494ea94eba46db86e04d8aa819d02c56fff7a470b36020b")
      override
          fun singleWeightPolicyConfig(singleWeightPolicyConfig: SingleWeightPolicyConfigProperty.Builder.() -> Unit):
          Unit =
          singleWeightPolicyConfig(SingleWeightPolicyConfigProperty(singleWeightPolicyConfig))

      /**
       * @param stagingDistributionDnsNames The CloudFront domain name of the staging distribution. 
       * For example: `d111111abcdef8.cloudfront.net` .
       */
      override fun stagingDistributionDnsNames(stagingDistributionDnsNames: List<String>) {
        cdkBuilder.stagingDistributionDnsNames(stagingDistributionDnsNames)
      }

      /**
       * @param stagingDistributionDnsNames The CloudFront domain name of the staging distribution. 
       * For example: `d111111abcdef8.cloudfront.net` .
       */
      override fun stagingDistributionDnsNames(vararg stagingDistributionDnsNames: String): Unit =
          stagingDistributionDnsNames(stagingDistributionDnsNames.toList())

      /**
       * @param trafficConfig Contains the parameters for routing production traffic from your
       * primary to staging distributions.
       */
      override fun trafficConfig(trafficConfig: IResolvable) {
        cdkBuilder.trafficConfig(trafficConfig.let(IResolvable::unwrap))
      }

      /**
       * @param trafficConfig Contains the parameters for routing production traffic from your
       * primary to staging distributions.
       */
      override fun trafficConfig(trafficConfig: TrafficConfigProperty) {
        cdkBuilder.trafficConfig(trafficConfig.let(TrafficConfigProperty::unwrap))
      }

      /**
       * @param trafficConfig Contains the parameters for routing production traffic from your
       * primary to staging distributions.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c1f18d10221ae381cfb3f3c1e0759c5ead3f14d94b734e082cce12fa39f182e9")
      override fun trafficConfig(trafficConfig: TrafficConfigProperty.Builder.() -> Unit): Unit =
          trafficConfig(TrafficConfigProperty(trafficConfig))

      /**
       * @param type The type of traffic configuration.
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty,
    ) : CdkObject(cdkObject), ContinuousDeploymentPolicyConfigProperty {
      /**
       * A Boolean that indicates whether this continuous deployment policy is enabled (in effect).
       *
       * When this value is `true` , this policy is enabled and in effect. When this value is
       * `false` , this policy is not enabled and has no effect.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig-enabled)
       */
      override fun enabled(): Any = unwrap(this).getEnabled()

      /**
       * This configuration determines which HTTP requests are sent to the staging distribution.
       *
       * If the HTTP request contains a header and value that matches what you specify here, the
       * request is sent to the staging distribution. Otherwise the request is sent to the primary
       * distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig-singleheaderpolicyconfig)
       */
      override fun singleHeaderPolicyConfig(): Any? = unwrap(this).getSingleHeaderPolicyConfig()

      /**
       * This configuration determines the percentage of HTTP requests that are sent to the staging
       * distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig-singleweightpolicyconfig)
       */
      override fun singleWeightPolicyConfig(): Any? = unwrap(this).getSingleWeightPolicyConfig()

      /**
       * The CloudFront domain name of the staging distribution.
       *
       * For example: `d111111abcdef8.cloudfront.net` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig-stagingdistributiondnsnames)
       */
      override fun stagingDistributionDnsNames(): List<String> =
          unwrap(this).getStagingDistributionDnsNames()

      /**
       * Contains the parameters for routing production traffic from your primary to staging
       * distributions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig-trafficconfig)
       */
      override fun trafficConfig(): Any? = unwrap(this).getTrafficConfig()

      /**
       * The type of traffic configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig.html#cfn-cloudfront-continuousdeploymentpolicy-continuousdeploymentpolicyconfig-type)
       */
      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ContinuousDeploymentPolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty):
          ContinuousDeploymentPolicyConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContinuousDeploymentPolicyConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContinuousDeploymentPolicyConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty
    }
  }

  /**
   * Session stickiness provides the ability to define multiple requests from a single viewer as a
   * single session.
   *
   * This prevents the potentially inconsistent experience of sending some of a given user's
   * requests to your staging distribution, while others are sent to your primary distribution. Define
   * the session duration using TTL values.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * SessionStickinessConfigProperty sessionStickinessConfigProperty =
   * SessionStickinessConfigProperty.builder()
   * .idleTtl(123)
   * .maximumTtl(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-sessionstickinessconfig.html)
   */
  public interface SessionStickinessConfigProperty {
    /**
     * The amount of time after which you want sessions to cease if no requests are received.
     *
     * Allowed values are 300–3600 seconds (5–60 minutes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-sessionstickinessconfig.html#cfn-cloudfront-continuousdeploymentpolicy-sessionstickinessconfig-idlettl)
     */
    public fun idleTtl(): Number

    /**
     * The maximum amount of time to consider requests from the viewer as being part of the same
     * session.
     *
     * Allowed values are 300–3600 seconds (5–60 minutes).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-sessionstickinessconfig.html#cfn-cloudfront-continuousdeploymentpolicy-sessionstickinessconfig-maximumttl)
     */
    public fun maximumTtl(): Number

    /**
     * A builder for [SessionStickinessConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param idleTtl The amount of time after which you want sessions to cease if no requests are
       * received. 
       * Allowed values are 300–3600 seconds (5–60 minutes).
       */
      public fun idleTtl(idleTtl: Number)

      /**
       * @param maximumTtl The maximum amount of time to consider requests from the viewer as being
       * part of the same session. 
       * Allowed values are 300–3600 seconds (5–60 minutes).
       */
      public fun maximumTtl(maximumTtl: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty.builder()

      /**
       * @param idleTtl The amount of time after which you want sessions to cease if no requests are
       * received. 
       * Allowed values are 300–3600 seconds (5–60 minutes).
       */
      override fun idleTtl(idleTtl: Number) {
        cdkBuilder.idleTtl(idleTtl)
      }

      /**
       * @param maximumTtl The maximum amount of time to consider requests from the viewer as being
       * part of the same session. 
       * Allowed values are 300–3600 seconds (5–60 minutes).
       */
      override fun maximumTtl(maximumTtl: Number) {
        cdkBuilder.maximumTtl(maximumTtl)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty,
    ) : CdkObject(cdkObject), SessionStickinessConfigProperty {
      /**
       * The amount of time after which you want sessions to cease if no requests are received.
       *
       * Allowed values are 300–3600 seconds (5–60 minutes).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-sessionstickinessconfig.html#cfn-cloudfront-continuousdeploymentpolicy-sessionstickinessconfig-idlettl)
       */
      override fun idleTtl(): Number = unwrap(this).getIdleTtl()

      /**
       * The maximum amount of time to consider requests from the viewer as being part of the same
       * session.
       *
       * Allowed values are 300–3600 seconds (5–60 minutes).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-sessionstickinessconfig.html#cfn-cloudfront-continuousdeploymentpolicy-sessionstickinessconfig-maximumttl)
       */
      override fun maximumTtl(): Number = unwrap(this).getMaximumTtl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SessionStickinessConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty):
          SessionStickinessConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SessionStickinessConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SessionStickinessConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SessionStickinessConfigProperty
    }
  }

  /**
   * Determines which HTTP requests are sent to the staging distribution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * SingleHeaderConfigProperty singleHeaderConfigProperty = SingleHeaderConfigProperty.builder()
   * .header("header")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleheaderconfig.html)
   */
  public interface SingleHeaderConfigProperty {
    /**
     * The request header name that you want CloudFront to send to your staging distribution.
     *
     * The header must contain the prefix `aws-cf-cd-` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleheaderconfig.html#cfn-cloudfront-continuousdeploymentpolicy-singleheaderconfig-header)
     */
    public fun `header`(): String

    /**
     * The request header value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleheaderconfig.html#cfn-cloudfront-continuousdeploymentpolicy-singleheaderconfig-value)
     */
    public fun `value`(): String

    /**
     * A builder for [SingleHeaderConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param header The request header name that you want CloudFront to send to your staging
       * distribution. 
       * The header must contain the prefix `aws-cf-cd-` .
       */
      public fun `header`(`header`: String)

      /**
       * @param value The request header value. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty.builder()

      /**
       * @param header The request header name that you want CloudFront to send to your staging
       * distribution. 
       * The header must contain the prefix `aws-cf-cd-` .
       */
      override fun `header`(`header`: String) {
        cdkBuilder.`header`(`header`)
      }

      /**
       * @param value The request header value. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty,
    ) : CdkObject(cdkObject), SingleHeaderConfigProperty {
      /**
       * The request header name that you want CloudFront to send to your staging distribution.
       *
       * The header must contain the prefix `aws-cf-cd-` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleheaderconfig.html#cfn-cloudfront-continuousdeploymentpolicy-singleheaderconfig-header)
       */
      override fun `header`(): String = unwrap(this).getHeader()

      /**
       * The request header value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleheaderconfig.html#cfn-cloudfront-continuousdeploymentpolicy-singleheaderconfig-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SingleHeaderConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty):
          SingleHeaderConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SingleHeaderConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleHeaderConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * SingleHeaderPolicyConfigProperty singleHeaderPolicyConfigProperty =
   * SingleHeaderPolicyConfigProperty.builder()
   * .header("header")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleheaderpolicyconfig.html)
   */
  public interface SingleHeaderPolicyConfigProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleheaderpolicyconfig.html#cfn-cloudfront-continuousdeploymentpolicy-singleheaderpolicyconfig-header)
     */
    public fun `header`(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleheaderpolicyconfig.html#cfn-cloudfront-continuousdeploymentpolicy-singleheaderpolicyconfig-value)
     */
    public fun `value`(): String

    /**
     * A builder for [SingleHeaderPolicyConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param header the value to be set. 
       */
      public fun `header`(`header`: String)

      /**
       * @param value the value to be set. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderPolicyConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderPolicyConfigProperty.builder()

      /**
       * @param header the value to be set. 
       */
      override fun `header`(`header`: String) {
        cdkBuilder.`header`(`header`)
      }

      /**
       * @param value the value to be set. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderPolicyConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderPolicyConfigProperty,
    ) : CdkObject(cdkObject), SingleHeaderPolicyConfigProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleheaderpolicyconfig.html#cfn-cloudfront-continuousdeploymentpolicy-singleheaderpolicyconfig-header)
       */
      override fun `header`(): String = unwrap(this).getHeader()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleheaderpolicyconfig.html#cfn-cloudfront-continuousdeploymentpolicy-singleheaderpolicyconfig-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SingleHeaderPolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderPolicyConfigProperty):
          SingleHeaderPolicyConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SingleHeaderPolicyConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleHeaderPolicyConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderPolicyConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleHeaderPolicyConfigProperty
    }
  }

  /**
   * This configuration determines the percentage of HTTP requests that are sent to the staging
   * distribution.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * SingleWeightConfigProperty singleWeightConfigProperty = SingleWeightConfigProperty.builder()
   * .weight(123)
   * // the properties below are optional
   * .sessionStickinessConfig(SessionStickinessConfigProperty.builder()
   * .idleTtl(123)
   * .maximumTtl(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleweightconfig.html)
   */
  public interface SingleWeightConfigProperty {
    /**
     * Session stickiness provides the ability to define multiple requests from a single viewer as a
     * single session.
     *
     * This prevents the potentially inconsistent experience of sending some of a given user's
     * requests to your staging distribution, while others are sent to your primary distribution.
     * Define the session duration using TTL values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleweightconfig.html#cfn-cloudfront-continuousdeploymentpolicy-singleweightconfig-sessionstickinessconfig)
     */
    public fun sessionStickinessConfig(): Any? = unwrap(this).getSessionStickinessConfig()

    /**
     * The percentage of traffic to send to a staging distribution, expressed as a decimal number
     * between 0 and 0.15. For example, a value of 0.10 means 10% of traffic is sent to the staging
     * distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleweightconfig.html#cfn-cloudfront-continuousdeploymentpolicy-singleweightconfig-weight)
     */
    public fun weight(): Number

    /**
     * A builder for [SingleWeightConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sessionStickinessConfig Session stickiness provides the ability to define multiple
       * requests from a single viewer as a single session.
       * This prevents the potentially inconsistent experience of sending some of a given user's
       * requests to your staging distribution, while others are sent to your primary distribution.
       * Define the session duration using TTL values.
       */
      public fun sessionStickinessConfig(sessionStickinessConfig: IResolvable)

      /**
       * @param sessionStickinessConfig Session stickiness provides the ability to define multiple
       * requests from a single viewer as a single session.
       * This prevents the potentially inconsistent experience of sending some of a given user's
       * requests to your staging distribution, while others are sent to your primary distribution.
       * Define the session duration using TTL values.
       */
      public fun sessionStickinessConfig(sessionStickinessConfig: SessionStickinessConfigProperty)

      /**
       * @param sessionStickinessConfig Session stickiness provides the ability to define multiple
       * requests from a single viewer as a single session.
       * This prevents the potentially inconsistent experience of sending some of a given user's
       * requests to your staging distribution, while others are sent to your primary distribution.
       * Define the session duration using TTL values.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("115c2e3d2be2a6141618d5281ac3254846c109b072920033bb4c3a6d8305f28e")
      public
          fun sessionStickinessConfig(sessionStickinessConfig: SessionStickinessConfigProperty.Builder.() -> Unit)

      /**
       * @param weight The percentage of traffic to send to a staging distribution, expressed as a
       * decimal number between 0 and 0.15. For example, a value of 0.10 means 10% of traffic is sent
       * to the staging distribution. 
       */
      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightConfigProperty.builder()

      /**
       * @param sessionStickinessConfig Session stickiness provides the ability to define multiple
       * requests from a single viewer as a single session.
       * This prevents the potentially inconsistent experience of sending some of a given user's
       * requests to your staging distribution, while others are sent to your primary distribution.
       * Define the session duration using TTL values.
       */
      override fun sessionStickinessConfig(sessionStickinessConfig: IResolvable) {
        cdkBuilder.sessionStickinessConfig(sessionStickinessConfig.let(IResolvable::unwrap))
      }

      /**
       * @param sessionStickinessConfig Session stickiness provides the ability to define multiple
       * requests from a single viewer as a single session.
       * This prevents the potentially inconsistent experience of sending some of a given user's
       * requests to your staging distribution, while others are sent to your primary distribution.
       * Define the session duration using TTL values.
       */
      override
          fun sessionStickinessConfig(sessionStickinessConfig: SessionStickinessConfigProperty) {
        cdkBuilder.sessionStickinessConfig(sessionStickinessConfig.let(SessionStickinessConfigProperty::unwrap))
      }

      /**
       * @param sessionStickinessConfig Session stickiness provides the ability to define multiple
       * requests from a single viewer as a single session.
       * This prevents the potentially inconsistent experience of sending some of a given user's
       * requests to your staging distribution, while others are sent to your primary distribution.
       * Define the session duration using TTL values.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("115c2e3d2be2a6141618d5281ac3254846c109b072920033bb4c3a6d8305f28e")
      override
          fun sessionStickinessConfig(sessionStickinessConfig: SessionStickinessConfigProperty.Builder.() -> Unit):
          Unit = sessionStickinessConfig(SessionStickinessConfigProperty(sessionStickinessConfig))

      /**
       * @param weight The percentage of traffic to send to a staging distribution, expressed as a
       * decimal number between 0 and 0.15. For example, a value of 0.10 means 10% of traffic is sent
       * to the staging distribution. 
       */
      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightConfigProperty,
    ) : CdkObject(cdkObject), SingleWeightConfigProperty {
      /**
       * Session stickiness provides the ability to define multiple requests from a single viewer as
       * a single session.
       *
       * This prevents the potentially inconsistent experience of sending some of a given user's
       * requests to your staging distribution, while others are sent to your primary distribution.
       * Define the session duration using TTL values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleweightconfig.html#cfn-cloudfront-continuousdeploymentpolicy-singleweightconfig-sessionstickinessconfig)
       */
      override fun sessionStickinessConfig(): Any? = unwrap(this).getSessionStickinessConfig()

      /**
       * The percentage of traffic to send to a staging distribution, expressed as a decimal number
       * between 0 and 0.15. For example, a value of 0.10 means 10% of traffic is sent to the staging
       * distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleweightconfig.html#cfn-cloudfront-continuousdeploymentpolicy-singleweightconfig-weight)
       */
      override fun weight(): Number = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SingleWeightConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightConfigProperty):
          SingleWeightConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SingleWeightConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleWeightConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightConfigProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * SingleWeightPolicyConfigProperty singleWeightPolicyConfigProperty =
   * SingleWeightPolicyConfigProperty.builder()
   * .weight(123)
   * // the properties below are optional
   * .sessionStickinessConfig(SessionStickinessConfigProperty.builder()
   * .idleTtl(123)
   * .maximumTtl(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleweightpolicyconfig.html)
   */
  public interface SingleWeightPolicyConfigProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleweightpolicyconfig.html#cfn-cloudfront-continuousdeploymentpolicy-singleweightpolicyconfig-sessionstickinessconfig)
     */
    public fun sessionStickinessConfig(): Any? = unwrap(this).getSessionStickinessConfig()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleweightpolicyconfig.html#cfn-cloudfront-continuousdeploymentpolicy-singleweightpolicyconfig-weight)
     */
    public fun weight(): Number

    /**
     * A builder for [SingleWeightPolicyConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sessionStickinessConfig the value to be set.
       */
      public fun sessionStickinessConfig(sessionStickinessConfig: IResolvable)

      /**
       * @param sessionStickinessConfig the value to be set.
       */
      public fun sessionStickinessConfig(sessionStickinessConfig: SessionStickinessConfigProperty)

      /**
       * @param sessionStickinessConfig the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84a16445b31759c204e527d9438144fd1c2e1960ae5d2a6dc3696de87e89688d")
      public
          fun sessionStickinessConfig(sessionStickinessConfig: SessionStickinessConfigProperty.Builder.() -> Unit)

      /**
       * @param weight the value to be set. 
       */
      public fun weight(weight: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightPolicyConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightPolicyConfigProperty.builder()

      /**
       * @param sessionStickinessConfig the value to be set.
       */
      override fun sessionStickinessConfig(sessionStickinessConfig: IResolvable) {
        cdkBuilder.sessionStickinessConfig(sessionStickinessConfig.let(IResolvable::unwrap))
      }

      /**
       * @param sessionStickinessConfig the value to be set.
       */
      override
          fun sessionStickinessConfig(sessionStickinessConfig: SessionStickinessConfigProperty) {
        cdkBuilder.sessionStickinessConfig(sessionStickinessConfig.let(SessionStickinessConfigProperty::unwrap))
      }

      /**
       * @param sessionStickinessConfig the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84a16445b31759c204e527d9438144fd1c2e1960ae5d2a6dc3696de87e89688d")
      override
          fun sessionStickinessConfig(sessionStickinessConfig: SessionStickinessConfigProperty.Builder.() -> Unit):
          Unit = sessionStickinessConfig(SessionStickinessConfigProperty(sessionStickinessConfig))

      /**
       * @param weight the value to be set. 
       */
      override fun weight(weight: Number) {
        cdkBuilder.weight(weight)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightPolicyConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightPolicyConfigProperty,
    ) : CdkObject(cdkObject), SingleWeightPolicyConfigProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleweightpolicyconfig.html#cfn-cloudfront-continuousdeploymentpolicy-singleweightpolicyconfig-sessionstickinessconfig)
       */
      override fun sessionStickinessConfig(): Any? = unwrap(this).getSessionStickinessConfig()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-singleweightpolicyconfig.html#cfn-cloudfront-continuousdeploymentpolicy-singleweightpolicyconfig-weight)
       */
      override fun weight(): Number = unwrap(this).getWeight()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SingleWeightPolicyConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightPolicyConfigProperty):
          SingleWeightPolicyConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SingleWeightPolicyConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SingleWeightPolicyConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightPolicyConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.SingleWeightPolicyConfigProperty
    }
  }

  /**
   * The traffic configuration of your continuous deployment.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cloudfront.*;
   * TrafficConfigProperty trafficConfigProperty = TrafficConfigProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .singleHeaderConfig(SingleHeaderConfigProperty.builder()
   * .header("header")
   * .value("value")
   * .build())
   * .singleWeightConfig(SingleWeightConfigProperty.builder()
   * .weight(123)
   * // the properties below are optional
   * .sessionStickinessConfig(SessionStickinessConfigProperty.builder()
   * .idleTtl(123)
   * .maximumTtl(123)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-trafficconfig.html)
   */
  public interface TrafficConfigProperty {
    /**
     * Determines which HTTP requests are sent to the staging distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-trafficconfig.html#cfn-cloudfront-continuousdeploymentpolicy-trafficconfig-singleheaderconfig)
     */
    public fun singleHeaderConfig(): Any? = unwrap(this).getSingleHeaderConfig()

    /**
     * Contains the percentage of traffic to send to the staging distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-trafficconfig.html#cfn-cloudfront-continuousdeploymentpolicy-trafficconfig-singleweightconfig)
     */
    public fun singleWeightConfig(): Any? = unwrap(this).getSingleWeightConfig()

    /**
     * The type of traffic configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-trafficconfig.html#cfn-cloudfront-continuousdeploymentpolicy-trafficconfig-type)
     */
    public fun type(): String

    /**
     * A builder for [TrafficConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param singleHeaderConfig Determines which HTTP requests are sent to the staging
       * distribution.
       */
      public fun singleHeaderConfig(singleHeaderConfig: IResolvable)

      /**
       * @param singleHeaderConfig Determines which HTTP requests are sent to the staging
       * distribution.
       */
      public fun singleHeaderConfig(singleHeaderConfig: SingleHeaderConfigProperty)

      /**
       * @param singleHeaderConfig Determines which HTTP requests are sent to the staging
       * distribution.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3d493f05136abb55d2ad8f7caeb155f0a8fa4dd8ab52c0a79406cb90c57e29fa")
      public
          fun singleHeaderConfig(singleHeaderConfig: SingleHeaderConfigProperty.Builder.() -> Unit)

      /**
       * @param singleWeightConfig Contains the percentage of traffic to send to the staging
       * distribution.
       */
      public fun singleWeightConfig(singleWeightConfig: IResolvable)

      /**
       * @param singleWeightConfig Contains the percentage of traffic to send to the staging
       * distribution.
       */
      public fun singleWeightConfig(singleWeightConfig: SingleWeightConfigProperty)

      /**
       * @param singleWeightConfig Contains the percentage of traffic to send to the staging
       * distribution.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc84ae95061411aac39bf13982bcd477f4ed3f1c68cb141ee06b3ad449628f94")
      public
          fun singleWeightConfig(singleWeightConfig: SingleWeightConfigProperty.Builder.() -> Unit)

      /**
       * @param type The type of traffic configuration. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.TrafficConfigProperty.Builder
          =
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.TrafficConfigProperty.builder()

      /**
       * @param singleHeaderConfig Determines which HTTP requests are sent to the staging
       * distribution.
       */
      override fun singleHeaderConfig(singleHeaderConfig: IResolvable) {
        cdkBuilder.singleHeaderConfig(singleHeaderConfig.let(IResolvable::unwrap))
      }

      /**
       * @param singleHeaderConfig Determines which HTTP requests are sent to the staging
       * distribution.
       */
      override fun singleHeaderConfig(singleHeaderConfig: SingleHeaderConfigProperty) {
        cdkBuilder.singleHeaderConfig(singleHeaderConfig.let(SingleHeaderConfigProperty::unwrap))
      }

      /**
       * @param singleHeaderConfig Determines which HTTP requests are sent to the staging
       * distribution.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3d493f05136abb55d2ad8f7caeb155f0a8fa4dd8ab52c0a79406cb90c57e29fa")
      override
          fun singleHeaderConfig(singleHeaderConfig: SingleHeaderConfigProperty.Builder.() -> Unit):
          Unit = singleHeaderConfig(SingleHeaderConfigProperty(singleHeaderConfig))

      /**
       * @param singleWeightConfig Contains the percentage of traffic to send to the staging
       * distribution.
       */
      override fun singleWeightConfig(singleWeightConfig: IResolvable) {
        cdkBuilder.singleWeightConfig(singleWeightConfig.let(IResolvable::unwrap))
      }

      /**
       * @param singleWeightConfig Contains the percentage of traffic to send to the staging
       * distribution.
       */
      override fun singleWeightConfig(singleWeightConfig: SingleWeightConfigProperty) {
        cdkBuilder.singleWeightConfig(singleWeightConfig.let(SingleWeightConfigProperty::unwrap))
      }

      /**
       * @param singleWeightConfig Contains the percentage of traffic to send to the staging
       * distribution.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc84ae95061411aac39bf13982bcd477f4ed3f1c68cb141ee06b3ad449628f94")
      override
          fun singleWeightConfig(singleWeightConfig: SingleWeightConfigProperty.Builder.() -> Unit):
          Unit = singleWeightConfig(SingleWeightConfigProperty(singleWeightConfig))

      /**
       * @param type The type of traffic configuration. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.TrafficConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.TrafficConfigProperty,
    ) : CdkObject(cdkObject), TrafficConfigProperty {
      /**
       * Determines which HTTP requests are sent to the staging distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-trafficconfig.html#cfn-cloudfront-continuousdeploymentpolicy-trafficconfig-singleheaderconfig)
       */
      override fun singleHeaderConfig(): Any? = unwrap(this).getSingleHeaderConfig()

      /**
       * Contains the percentage of traffic to send to the staging distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-trafficconfig.html#cfn-cloudfront-continuousdeploymentpolicy-trafficconfig-singleweightconfig)
       */
      override fun singleWeightConfig(): Any? = unwrap(this).getSingleWeightConfig()

      /**
       * The type of traffic configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-continuousdeploymentpolicy-trafficconfig.html#cfn-cloudfront-continuousdeploymentpolicy-trafficconfig-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrafficConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.TrafficConfigProperty):
          TrafficConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? TrafficConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrafficConfigProperty):
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.TrafficConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy.TrafficConfigProperty
    }
  }
}
