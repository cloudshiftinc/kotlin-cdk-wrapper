@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
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
 * Creates a target group.
 *
 * A target group is a collection of targets, or compute resources, that run your application or
 * service. A target group can only be used by a single service.
 *
 * For more information, see [Target
 * groups](https://docs.aws.amazon.com/vpc-lattice/latest/ug/target-groups.html) in the *Amazon VPC
 * Lattice User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * CfnTargetGroup cfnTargetGroup = CfnTargetGroup.Builder.create(this, "MyCfnTargetGroup")
 * .type("type")
 * // the properties below are optional
 * .config(TargetGroupConfigProperty.builder()
 * .healthCheck(HealthCheckConfigProperty.builder()
 * .enabled(false)
 * .healthCheckIntervalSeconds(123)
 * .healthCheckTimeoutSeconds(123)
 * .healthyThresholdCount(123)
 * .matcher(MatcherProperty.builder()
 * .httpCode("httpCode")
 * .build())
 * .path("path")
 * .port(123)
 * .protocol("protocol")
 * .protocolVersion("protocolVersion")
 * .unhealthyThresholdCount(123)
 * .build())
 * .ipAddressType("ipAddressType")
 * .lambdaEventStructureVersion("lambdaEventStructureVersion")
 * .port(123)
 * .protocol("protocol")
 * .protocolVersion("protocolVersion")
 * .vpcIdentifier("vpcIdentifier")
 * .build())
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .targets(List.of(TargetProperty.builder()
 * .id("id")
 * // the properties below are optional
 * .port(123)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html)
 */
public open class CfnTargetGroup(
  cdkObject: software.amazon.awscdk.services.vpclattice.CfnTargetGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTargetGroupProps,
  ) :
      this(software.amazon.awscdk.services.vpclattice.CfnTargetGroup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnTargetGroupProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTargetGroupProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTargetGroupProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the target group.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The date and time that the target group was created, specified in ISO-8601 format.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The ID of the target group.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The date and time that the target group was last updated, specified in ISO-8601 format.
   */
  public open fun attrLastUpdatedAt(): String = unwrap(this).getAttrLastUpdatedAt()

  /**
   * The operation's status.
   *
   * You can retry the operation if the status is `CREATE_FAILED` . However, if you retry it while
   * the status is `CREATE_IN_PROGRESS` , there is no change in the status.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The target group configuration.
   */
  public open fun config(): Any? = unwrap(this).getConfig()

  /**
   * The target group configuration.
   */
  public open fun config(`value`: IResolvable) {
    unwrap(this).setConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * The target group configuration.
   */
  public open fun config(`value`: TargetGroupConfigProperty) {
    unwrap(this).setConfig(`value`.let(TargetGroupConfigProperty::unwrap))
  }

  /**
   * The target group configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4f4ccf341b9cd6b69e2d31849bfccd0a3384f2fa5f3ed5cd8ddb782a688d3f71")
  public open fun config(`value`: TargetGroupConfigProperty.Builder.() -> Unit): Unit =
      config(TargetGroupConfigProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the target group.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the target group.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags for the target group.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags for the target group.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags for the target group.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Describes a target.
   */
  public open fun targets(): Any? = unwrap(this).getTargets()

  /**
   * Describes a target.
   */
  public open fun targets(`value`: IResolvable) {
    unwrap(this).setTargets(`value`.let(IResolvable::unwrap))
  }

  /**
   * Describes a target.
   */
  public open fun targets(`value`: List<Any>) {
    unwrap(this).setTargets(`value`)
  }

  /**
   * Describes a target.
   */
  public open fun targets(vararg `value`: Any): Unit = targets(`value`.toList())

  /**
   * The type of target group.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of target group.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.vpclattice.CfnTargetGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The target group configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-config)
     * @param config The target group configuration. 
     */
    public fun config(config: IResolvable)

    /**
     * The target group configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-config)
     * @param config The target group configuration. 
     */
    public fun config(config: TargetGroupConfigProperty)

    /**
     * The target group configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-config)
     * @param config The target group configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a926747e7caf939bef4de8eae6a385eecd88dfc04fe41e97fa09b0ef118da04")
    public fun config(config: TargetGroupConfigProperty.Builder.() -> Unit)

    /**
     * The name of the target group.
     *
     * The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens
     * (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-name)
     * @param name The name of the target group. 
     */
    public fun name(name: String)

    /**
     * The tags for the target group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-tags)
     * @param tags The tags for the target group. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags for the target group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-tags)
     * @param tags The tags for the target group. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Describes a target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-targets)
     * @param targets Describes a target. 
     */
    public fun targets(targets: IResolvable)

    /**
     * Describes a target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-targets)
     * @param targets Describes a target. 
     */
    public fun targets(targets: List<Any>)

    /**
     * Describes a target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-targets)
     * @param targets Describes a target. 
     */
    public fun targets(vararg targets: Any)

    /**
     * The type of target group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-type)
     * @param type The type of target group. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnTargetGroup.Builder =
        software.amazon.awscdk.services.vpclattice.CfnTargetGroup.Builder.create(scope, id)

    /**
     * The target group configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-config)
     * @param config The target group configuration. 
     */
    override fun config(config: IResolvable) {
      cdkBuilder.config(config.let(IResolvable::unwrap))
    }

    /**
     * The target group configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-config)
     * @param config The target group configuration. 
     */
    override fun config(config: TargetGroupConfigProperty) {
      cdkBuilder.config(config.let(TargetGroupConfigProperty::unwrap))
    }

    /**
     * The target group configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-config)
     * @param config The target group configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4a926747e7caf939bef4de8eae6a385eecd88dfc04fe41e97fa09b0ef118da04")
    override fun config(config: TargetGroupConfigProperty.Builder.() -> Unit): Unit =
        config(TargetGroupConfigProperty(config))

    /**
     * The name of the target group.
     *
     * The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens
     * (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-name)
     * @param name The name of the target group. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags for the target group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-tags)
     * @param tags The tags for the target group. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags for the target group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-tags)
     * @param tags The tags for the target group. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Describes a target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-targets)
     * @param targets Describes a target. 
     */
    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    /**
     * Describes a target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-targets)
     * @param targets Describes a target. 
     */
    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets)
    }

    /**
     * Describes a target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-targets)
     * @param targets Describes a target. 
     */
    override fun targets(vararg targets: Any): Unit = targets(targets.toList())

    /**
     * The type of target group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-type)
     * @param type The type of target group. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnTargetGroup =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.vpclattice.CfnTargetGroup.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTargetGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTargetGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnTargetGroup):
        CfnTargetGroup = CfnTargetGroup(cdkObject)

    internal fun unwrap(wrapped: CfnTargetGroup):
        software.amazon.awscdk.services.vpclattice.CfnTargetGroup = wrapped.cdkObject as
        software.amazon.awscdk.services.vpclattice.CfnTargetGroup
  }

  /**
   * Describes the health check configuration of a target group.
   *
   * Health check configurations aren't used for target groups of type `LAMBDA` or `ALB` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * HealthCheckConfigProperty healthCheckConfigProperty = HealthCheckConfigProperty.builder()
   * .enabled(false)
   * .healthCheckIntervalSeconds(123)
   * .healthCheckTimeoutSeconds(123)
   * .healthyThresholdCount(123)
   * .matcher(MatcherProperty.builder()
   * .httpCode("httpCode")
   * .build())
   * .path("path")
   * .port(123)
   * .protocol("protocol")
   * .protocolVersion("protocolVersion")
   * .unhealthyThresholdCount(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html)
   */
  public interface HealthCheckConfigProperty {
    /**
     * Indicates whether health checking is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html#cfn-vpclattice-targetgroup-healthcheckconfig-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The approximate amount of time, in seconds, between health checks of an individual target.
     *
     * The range is 5–300 seconds. The default is 30 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html#cfn-vpclattice-targetgroup-healthcheckconfig-healthcheckintervalseconds)
     */
    public fun healthCheckIntervalSeconds(): Number? = unwrap(this).getHealthCheckIntervalSeconds()

    /**
     * The amount of time, in seconds, to wait before reporting a target as unhealthy.
     *
     * The range is 1–120 seconds. The default is 5 seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html#cfn-vpclattice-targetgroup-healthcheckconfig-healthchecktimeoutseconds)
     */
    public fun healthCheckTimeoutSeconds(): Number? = unwrap(this).getHealthCheckTimeoutSeconds()

    /**
     * The number of consecutive successful health checks required before considering an unhealthy
     * target healthy.
     *
     * The range is 2–10. The default is 5.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html#cfn-vpclattice-targetgroup-healthcheckconfig-healthythresholdcount)
     */
    public fun healthyThresholdCount(): Number? = unwrap(this).getHealthyThresholdCount()

    /**
     * The codes to use when checking for a successful response from a target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html#cfn-vpclattice-targetgroup-healthcheckconfig-matcher)
     */
    public fun matcher(): Any? = unwrap(this).getMatcher()

    /**
     * The destination for health checks on the targets.
     *
     * If the protocol version is `HTTP/1.1` or `HTTP/2` , specify a valid URI (for example,
     * `/path?query` ). The default path is `/` . Health checks are not supported if the protocol
     * version is `gRPC` , however, you can choose `HTTP/1.1` or `HTTP/2` and specify a valid URI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html#cfn-vpclattice-targetgroup-healthcheckconfig-path)
     */
    public fun path(): String? = unwrap(this).getPath()

    /**
     * The port used when performing health checks on targets.
     *
     * The default setting is the port that a target receives traffic on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html#cfn-vpclattice-targetgroup-healthcheckconfig-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * The protocol used when performing health checks on targets.
     *
     * The possible protocols are `HTTP` and `HTTPS` . The default is `HTTP` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html#cfn-vpclattice-targetgroup-healthcheckconfig-protocol)
     */
    public fun protocol(): String? = unwrap(this).getProtocol()

    /**
     * The protocol version used when performing health checks on targets.
     *
     * The possible protocol versions are `HTTP1` and `HTTP2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html#cfn-vpclattice-targetgroup-healthcheckconfig-protocolversion)
     */
    public fun protocolVersion(): String? = unwrap(this).getProtocolVersion()

    /**
     * The number of consecutive failed health checks required before considering a target
     * unhealthy.
     *
     * The range is 2–10. The default is 2.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html#cfn-vpclattice-targetgroup-healthcheckconfig-unhealthythresholdcount)
     */
    public fun unhealthyThresholdCount(): Number? = unwrap(this).getUnhealthyThresholdCount()

    /**
     * A builder for [HealthCheckConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param enabled Indicates whether health checking is enabled.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Indicates whether health checking is enabled.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param healthCheckIntervalSeconds The approximate amount of time, in seconds, between
       * health checks of an individual target.
       * The range is 5–300 seconds. The default is 30 seconds.
       */
      public fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number)

      /**
       * @param healthCheckTimeoutSeconds The amount of time, in seconds, to wait before reporting a
       * target as unhealthy.
       * The range is 1–120 seconds. The default is 5 seconds.
       */
      public fun healthCheckTimeoutSeconds(healthCheckTimeoutSeconds: Number)

      /**
       * @param healthyThresholdCount The number of consecutive successful health checks required
       * before considering an unhealthy target healthy.
       * The range is 2–10. The default is 5.
       */
      public fun healthyThresholdCount(healthyThresholdCount: Number)

      /**
       * @param matcher The codes to use when checking for a successful response from a target.
       */
      public fun matcher(matcher: IResolvable)

      /**
       * @param matcher The codes to use when checking for a successful response from a target.
       */
      public fun matcher(matcher: MatcherProperty)

      /**
       * @param matcher The codes to use when checking for a successful response from a target.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dc579f163b5fcc356ab59090b8b20c72ca6c0bbb4901bf927133c145f2f336be")
      public fun matcher(matcher: MatcherProperty.Builder.() -> Unit)

      /**
       * @param path The destination for health checks on the targets.
       * If the protocol version is `HTTP/1.1` or `HTTP/2` , specify a valid URI (for example,
       * `/path?query` ). The default path is `/` . Health checks are not supported if the protocol
       * version is `gRPC` , however, you can choose `HTTP/1.1` or `HTTP/2` and specify a valid URI.
       */
      public fun path(path: String)

      /**
       * @param port The port used when performing health checks on targets.
       * The default setting is the port that a target receives traffic on.
       */
      public fun port(port: Number)

      /**
       * @param protocol The protocol used when performing health checks on targets.
       * The possible protocols are `HTTP` and `HTTPS` . The default is `HTTP` .
       */
      public fun protocol(protocol: String)

      /**
       * @param protocolVersion The protocol version used when performing health checks on targets.
       * The possible protocol versions are `HTTP1` and `HTTP2` .
       */
      public fun protocolVersion(protocolVersion: String)

      /**
       * @param unhealthyThresholdCount The number of consecutive failed health checks required
       * before considering a target unhealthy.
       * The range is 2–10. The default is 2.
       */
      public fun unhealthyThresholdCount(unhealthyThresholdCount: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.HealthCheckConfigProperty.Builder
          =
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.HealthCheckConfigProperty.builder()

      /**
       * @param enabled Indicates whether health checking is enabled.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Indicates whether health checking is enabled.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param healthCheckIntervalSeconds The approximate amount of time, in seconds, between
       * health checks of an individual target.
       * The range is 5–300 seconds. The default is 30 seconds.
       */
      override fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number) {
        cdkBuilder.healthCheckIntervalSeconds(healthCheckIntervalSeconds)
      }

      /**
       * @param healthCheckTimeoutSeconds The amount of time, in seconds, to wait before reporting a
       * target as unhealthy.
       * The range is 1–120 seconds. The default is 5 seconds.
       */
      override fun healthCheckTimeoutSeconds(healthCheckTimeoutSeconds: Number) {
        cdkBuilder.healthCheckTimeoutSeconds(healthCheckTimeoutSeconds)
      }

      /**
       * @param healthyThresholdCount The number of consecutive successful health checks required
       * before considering an unhealthy target healthy.
       * The range is 2–10. The default is 5.
       */
      override fun healthyThresholdCount(healthyThresholdCount: Number) {
        cdkBuilder.healthyThresholdCount(healthyThresholdCount)
      }

      /**
       * @param matcher The codes to use when checking for a successful response from a target.
       */
      override fun matcher(matcher: IResolvable) {
        cdkBuilder.matcher(matcher.let(IResolvable::unwrap))
      }

      /**
       * @param matcher The codes to use when checking for a successful response from a target.
       */
      override fun matcher(matcher: MatcherProperty) {
        cdkBuilder.matcher(matcher.let(MatcherProperty::unwrap))
      }

      /**
       * @param matcher The codes to use when checking for a successful response from a target.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dc579f163b5fcc356ab59090b8b20c72ca6c0bbb4901bf927133c145f2f336be")
      override fun matcher(matcher: MatcherProperty.Builder.() -> Unit): Unit =
          matcher(MatcherProperty(matcher))

      /**
       * @param path The destination for health checks on the targets.
       * If the protocol version is `HTTP/1.1` or `HTTP/2` , specify a valid URI (for example,
       * `/path?query` ). The default path is `/` . Health checks are not supported if the protocol
       * version is `gRPC` , however, you can choose `HTTP/1.1` or `HTTP/2` and specify a valid URI.
       */
      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      /**
       * @param port The port used when performing health checks on targets.
       * The default setting is the port that a target receives traffic on.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param protocol The protocol used when performing health checks on targets.
       * The possible protocols are `HTTP` and `HTTPS` . The default is `HTTP` .
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      /**
       * @param protocolVersion The protocol version used when performing health checks on targets.
       * The possible protocol versions are `HTTP1` and `HTTP2` .
       */
      override fun protocolVersion(protocolVersion: String) {
        cdkBuilder.protocolVersion(protocolVersion)
      }

      /**
       * @param unhealthyThresholdCount The number of consecutive failed health checks required
       * before considering a target unhealthy.
       * The range is 2–10. The default is 2.
       */
      override fun unhealthyThresholdCount(unhealthyThresholdCount: Number) {
        cdkBuilder.unhealthyThresholdCount(unhealthyThresholdCount)
      }

      public fun build():
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.HealthCheckConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.vpclattice.CfnTargetGroup.HealthCheckConfigProperty,
    ) : CdkObject(cdkObject), HealthCheckConfigProperty {
      /**
       * Indicates whether health checking is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html#cfn-vpclattice-targetgroup-healthcheckconfig-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * The approximate amount of time, in seconds, between health checks of an individual target.
       *
       * The range is 5–300 seconds. The default is 30 seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html#cfn-vpclattice-targetgroup-healthcheckconfig-healthcheckintervalseconds)
       */
      override fun healthCheckIntervalSeconds(): Number? =
          unwrap(this).getHealthCheckIntervalSeconds()

      /**
       * The amount of time, in seconds, to wait before reporting a target as unhealthy.
       *
       * The range is 1–120 seconds. The default is 5 seconds.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html#cfn-vpclattice-targetgroup-healthcheckconfig-healthchecktimeoutseconds)
       */
      override fun healthCheckTimeoutSeconds(): Number? =
          unwrap(this).getHealthCheckTimeoutSeconds()

      /**
       * The number of consecutive successful health checks required before considering an unhealthy
       * target healthy.
       *
       * The range is 2–10. The default is 5.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html#cfn-vpclattice-targetgroup-healthcheckconfig-healthythresholdcount)
       */
      override fun healthyThresholdCount(): Number? = unwrap(this).getHealthyThresholdCount()

      /**
       * The codes to use when checking for a successful response from a target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html#cfn-vpclattice-targetgroup-healthcheckconfig-matcher)
       */
      override fun matcher(): Any? = unwrap(this).getMatcher()

      /**
       * The destination for health checks on the targets.
       *
       * If the protocol version is `HTTP/1.1` or `HTTP/2` , specify a valid URI (for example,
       * `/path?query` ). The default path is `/` . Health checks are not supported if the protocol
       * version is `gRPC` , however, you can choose `HTTP/1.1` or `HTTP/2` and specify a valid URI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html#cfn-vpclattice-targetgroup-healthcheckconfig-path)
       */
      override fun path(): String? = unwrap(this).getPath()

      /**
       * The port used when performing health checks on targets.
       *
       * The default setting is the port that a target receives traffic on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html#cfn-vpclattice-targetgroup-healthcheckconfig-port)
       */
      override fun port(): Number? = unwrap(this).getPort()

      /**
       * The protocol used when performing health checks on targets.
       *
       * The possible protocols are `HTTP` and `HTTPS` . The default is `HTTP` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html#cfn-vpclattice-targetgroup-healthcheckconfig-protocol)
       */
      override fun protocol(): String? = unwrap(this).getProtocol()

      /**
       * The protocol version used when performing health checks on targets.
       *
       * The possible protocol versions are `HTTP1` and `HTTP2` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html#cfn-vpclattice-targetgroup-healthcheckconfig-protocolversion)
       */
      override fun protocolVersion(): String? = unwrap(this).getProtocolVersion()

      /**
       * The number of consecutive failed health checks required before considering a target
       * unhealthy.
       *
       * The range is 2–10. The default is 2.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-healthcheckconfig.html#cfn-vpclattice-targetgroup-healthcheckconfig-unhealthythresholdcount)
       */
      override fun unhealthyThresholdCount(): Number? = unwrap(this).getUnhealthyThresholdCount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): HealthCheckConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnTargetGroup.HealthCheckConfigProperty):
          HealthCheckConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          HealthCheckConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: HealthCheckConfigProperty):
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.HealthCheckConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.HealthCheckConfigProperty
    }
  }

  /**
   * Describes the codes to use when checking for a successful response from a target for health
   * checks.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * MatcherProperty matcherProperty = MatcherProperty.builder()
   * .httpCode("httpCode")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-matcher.html)
   */
  public interface MatcherProperty {
    /**
     * The HTTP code to use when checking for a successful response from a target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-matcher.html#cfn-vpclattice-targetgroup-matcher-httpcode)
     */
    public fun httpCode(): String

    /**
     * A builder for [MatcherProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param httpCode The HTTP code to use when checking for a successful response from a target.
       * 
       */
      public fun httpCode(httpCode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.MatcherProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.MatcherProperty.builder()

      /**
       * @param httpCode The HTTP code to use when checking for a successful response from a target.
       * 
       */
      override fun httpCode(httpCode: String) {
        cdkBuilder.httpCode(httpCode)
      }

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnTargetGroup.MatcherProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.vpclattice.CfnTargetGroup.MatcherProperty,
    ) : CdkObject(cdkObject), MatcherProperty {
      /**
       * The HTTP code to use when checking for a successful response from a target.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-matcher.html#cfn-vpclattice-targetgroup-matcher-httpcode)
       */
      override fun httpCode(): String = unwrap(this).getHttpCode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MatcherProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnTargetGroup.MatcherProperty):
          MatcherProperty = CdkObjectWrappers.wrap(cdkObject) as? MatcherProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MatcherProperty):
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.MatcherProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.MatcherProperty
    }
  }

  /**
   * Describes the configuration of a target group.
   *
   * For more information, see [Target
   * groups](https://docs.aws.amazon.com/vpc-lattice/latest/ug/target-groups.html) in the *Amazon VPC
   * Lattice User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * TargetGroupConfigProperty targetGroupConfigProperty = TargetGroupConfigProperty.builder()
   * .healthCheck(HealthCheckConfigProperty.builder()
   * .enabled(false)
   * .healthCheckIntervalSeconds(123)
   * .healthCheckTimeoutSeconds(123)
   * .healthyThresholdCount(123)
   * .matcher(MatcherProperty.builder()
   * .httpCode("httpCode")
   * .build())
   * .path("path")
   * .port(123)
   * .protocol("protocol")
   * .protocolVersion("protocolVersion")
   * .unhealthyThresholdCount(123)
   * .build())
   * .ipAddressType("ipAddressType")
   * .lambdaEventStructureVersion("lambdaEventStructureVersion")
   * .port(123)
   * .protocol("protocol")
   * .protocolVersion("protocolVersion")
   * .vpcIdentifier("vpcIdentifier")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-targetgroupconfig.html)
   */
  public interface TargetGroupConfigProperty {
    /**
     * The health check configuration.
     *
     * Not supported if the target group type is `LAMBDA` or `ALB` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-targetgroupconfig.html#cfn-vpclattice-targetgroup-targetgroupconfig-healthcheck)
     */
    public fun healthCheck(): Any? = unwrap(this).getHealthCheck()

    /**
     * The type of IP address used for the target group.
     *
     * Supported only if the target group type is `IP` . The default is `IPV4` .
     *
     * Default: - "IPV4"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-targetgroupconfig.html#cfn-vpclattice-targetgroup-targetgroupconfig-ipaddresstype)
     */
    public fun ipAddressType(): String? = unwrap(this).getIpAddressType()

    /**
     * The version of the event structure that your Lambda function receives.
     *
     * Supported only if the target group type is `LAMBDA` . The default is `V1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-targetgroupconfig.html#cfn-vpclattice-targetgroup-targetgroupconfig-lambdaeventstructureversion)
     */
    public fun lambdaEventStructureVersion(): String? =
        unwrap(this).getLambdaEventStructureVersion()

    /**
     * The port on which the targets are listening.
     *
     * For HTTP, the default is 80. For HTTPS, the default is 443. Not supported if the target group
     * type is `LAMBDA` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-targetgroupconfig.html#cfn-vpclattice-targetgroup-targetgroupconfig-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * The protocol to use for routing traffic to the targets.
     *
     * The default is the protocol of the target group. Not supported if the target group type is
     * `LAMBDA` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-targetgroupconfig.html#cfn-vpclattice-targetgroup-targetgroupconfig-protocol)
     */
    public fun protocol(): String? = unwrap(this).getProtocol()

    /**
     * The protocol version.
     *
     * The default is `HTTP1` . Not supported if the target group type is `LAMBDA` .
     *
     * Default: - "HTTP1"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-targetgroupconfig.html#cfn-vpclattice-targetgroup-targetgroupconfig-protocolversion)
     */
    public fun protocolVersion(): String? = unwrap(this).getProtocolVersion()

    /**
     * The ID of the VPC.
     *
     * Not supported if the target group type is `LAMBDA` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-targetgroupconfig.html#cfn-vpclattice-targetgroup-targetgroupconfig-vpcidentifier)
     */
    public fun vpcIdentifier(): String? = unwrap(this).getVpcIdentifier()

    /**
     * A builder for [TargetGroupConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param healthCheck The health check configuration.
       * Not supported if the target group type is `LAMBDA` or `ALB` .
       */
      public fun healthCheck(healthCheck: IResolvable)

      /**
       * @param healthCheck The health check configuration.
       * Not supported if the target group type is `LAMBDA` or `ALB` .
       */
      public fun healthCheck(healthCheck: HealthCheckConfigProperty)

      /**
       * @param healthCheck The health check configuration.
       * Not supported if the target group type is `LAMBDA` or `ALB` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72e53bf3518aa8352dbc54567f9fc646c825ed91bb8f8127cd0a14182046f628")
      public fun healthCheck(healthCheck: HealthCheckConfigProperty.Builder.() -> Unit)

      /**
       * @param ipAddressType The type of IP address used for the target group.
       * Supported only if the target group type is `IP` . The default is `IPV4` .
       */
      public fun ipAddressType(ipAddressType: String)

      /**
       * @param lambdaEventStructureVersion The version of the event structure that your Lambda
       * function receives.
       * Supported only if the target group type is `LAMBDA` . The default is `V1` .
       */
      public fun lambdaEventStructureVersion(lambdaEventStructureVersion: String)

      /**
       * @param port The port on which the targets are listening.
       * For HTTP, the default is 80. For HTTPS, the default is 443. Not supported if the target
       * group type is `LAMBDA` .
       */
      public fun port(port: Number)

      /**
       * @param protocol The protocol to use for routing traffic to the targets.
       * The default is the protocol of the target group. Not supported if the target group type is
       * `LAMBDA` .
       */
      public fun protocol(protocol: String)

      /**
       * @param protocolVersion The protocol version.
       * The default is `HTTP1` . Not supported if the target group type is `LAMBDA` .
       */
      public fun protocolVersion(protocolVersion: String)

      /**
       * @param vpcIdentifier The ID of the VPC.
       * Not supported if the target group type is `LAMBDA` .
       */
      public fun vpcIdentifier(vpcIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetGroupConfigProperty.Builder
          =
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetGroupConfigProperty.builder()

      /**
       * @param healthCheck The health check configuration.
       * Not supported if the target group type is `LAMBDA` or `ALB` .
       */
      override fun healthCheck(healthCheck: IResolvable) {
        cdkBuilder.healthCheck(healthCheck.let(IResolvable::unwrap))
      }

      /**
       * @param healthCheck The health check configuration.
       * Not supported if the target group type is `LAMBDA` or `ALB` .
       */
      override fun healthCheck(healthCheck: HealthCheckConfigProperty) {
        cdkBuilder.healthCheck(healthCheck.let(HealthCheckConfigProperty::unwrap))
      }

      /**
       * @param healthCheck The health check configuration.
       * Not supported if the target group type is `LAMBDA` or `ALB` .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72e53bf3518aa8352dbc54567f9fc646c825ed91bb8f8127cd0a14182046f628")
      override fun healthCheck(healthCheck: HealthCheckConfigProperty.Builder.() -> Unit): Unit =
          healthCheck(HealthCheckConfigProperty(healthCheck))

      /**
       * @param ipAddressType The type of IP address used for the target group.
       * Supported only if the target group type is `IP` . The default is `IPV4` .
       */
      override fun ipAddressType(ipAddressType: String) {
        cdkBuilder.ipAddressType(ipAddressType)
      }

      /**
       * @param lambdaEventStructureVersion The version of the event structure that your Lambda
       * function receives.
       * Supported only if the target group type is `LAMBDA` . The default is `V1` .
       */
      override fun lambdaEventStructureVersion(lambdaEventStructureVersion: String) {
        cdkBuilder.lambdaEventStructureVersion(lambdaEventStructureVersion)
      }

      /**
       * @param port The port on which the targets are listening.
       * For HTTP, the default is 80. For HTTPS, the default is 443. Not supported if the target
       * group type is `LAMBDA` .
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      /**
       * @param protocol The protocol to use for routing traffic to the targets.
       * The default is the protocol of the target group. Not supported if the target group type is
       * `LAMBDA` .
       */
      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      /**
       * @param protocolVersion The protocol version.
       * The default is `HTTP1` . Not supported if the target group type is `LAMBDA` .
       */
      override fun protocolVersion(protocolVersion: String) {
        cdkBuilder.protocolVersion(protocolVersion)
      }

      /**
       * @param vpcIdentifier The ID of the VPC.
       * Not supported if the target group type is `LAMBDA` .
       */
      override fun vpcIdentifier(vpcIdentifier: String) {
        cdkBuilder.vpcIdentifier(vpcIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetGroupConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetGroupConfigProperty,
    ) : CdkObject(cdkObject), TargetGroupConfigProperty {
      /**
       * The health check configuration.
       *
       * Not supported if the target group type is `LAMBDA` or `ALB` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-targetgroupconfig.html#cfn-vpclattice-targetgroup-targetgroupconfig-healthcheck)
       */
      override fun healthCheck(): Any? = unwrap(this).getHealthCheck()

      /**
       * The type of IP address used for the target group.
       *
       * Supported only if the target group type is `IP` . The default is `IPV4` .
       *
       * Default: - "IPV4"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-targetgroupconfig.html#cfn-vpclattice-targetgroup-targetgroupconfig-ipaddresstype)
       */
      override fun ipAddressType(): String? = unwrap(this).getIpAddressType()

      /**
       * The version of the event structure that your Lambda function receives.
       *
       * Supported only if the target group type is `LAMBDA` . The default is `V1` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-targetgroupconfig.html#cfn-vpclattice-targetgroup-targetgroupconfig-lambdaeventstructureversion)
       */
      override fun lambdaEventStructureVersion(): String? =
          unwrap(this).getLambdaEventStructureVersion()

      /**
       * The port on which the targets are listening.
       *
       * For HTTP, the default is 80. For HTTPS, the default is 443. Not supported if the target
       * group type is `LAMBDA` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-targetgroupconfig.html#cfn-vpclattice-targetgroup-targetgroupconfig-port)
       */
      override fun port(): Number? = unwrap(this).getPort()

      /**
       * The protocol to use for routing traffic to the targets.
       *
       * The default is the protocol of the target group. Not supported if the target group type is
       * `LAMBDA` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-targetgroupconfig.html#cfn-vpclattice-targetgroup-targetgroupconfig-protocol)
       */
      override fun protocol(): String? = unwrap(this).getProtocol()

      /**
       * The protocol version.
       *
       * The default is `HTTP1` . Not supported if the target group type is `LAMBDA` .
       *
       * Default: - "HTTP1"
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-targetgroupconfig.html#cfn-vpclattice-targetgroup-targetgroupconfig-protocolversion)
       */
      override fun protocolVersion(): String? = unwrap(this).getProtocolVersion()

      /**
       * The ID of the VPC.
       *
       * Not supported if the target group type is `LAMBDA` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-targetgroupconfig.html#cfn-vpclattice-targetgroup-targetgroupconfig-vpcidentifier)
       */
      override fun vpcIdentifier(): String? = unwrap(this).getVpcIdentifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetGroupConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetGroupConfigProperty):
          TargetGroupConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TargetGroupConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetGroupConfigProperty):
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetGroupConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetGroupConfigProperty
    }
  }

  /**
   * Describes a target.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.vpclattice.*;
   * TargetProperty targetProperty = TargetProperty.builder()
   * .id("id")
   * // the properties below are optional
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-target.html)
   */
  public interface TargetProperty {
    /**
     * The ID of the target.
     *
     * If the target group type is `INSTANCE` , this is an instance ID. If the target group type is
     * `IP` , this is an IP address. If the target group type is `LAMBDA` , this is the ARN of a Lambda
     * function. If the target group type is `ALB` , this is the ARN of an Application Load Balancer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-target.html#cfn-vpclattice-targetgroup-target-id)
     */
    public fun id(): String

    /**
     * The port on which the target is listening.
     *
     * For HTTP, the default is 80. For HTTPS, the default is 443.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-target.html#cfn-vpclattice-targetgroup-target-port)
     */
    public fun port(): Number? = unwrap(this).getPort()

    /**
     * A builder for [TargetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The ID of the target. 
       * If the target group type is `INSTANCE` , this is an instance ID. If the target group type
       * is `IP` , this is an IP address. If the target group type is `LAMBDA` , this is the ARN of a
       * Lambda function. If the target group type is `ALB` , this is the ARN of an Application Load
       * Balancer.
       */
      public fun id(id: String)

      /**
       * @param port The port on which the target is listening.
       * For HTTP, the default is 80. For HTTPS, the default is 443.
       */
      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetProperty.Builder =
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetProperty.builder()

      /**
       * @param id The ID of the target. 
       * If the target group type is `INSTANCE` , this is an instance ID. If the target group type
       * is `IP` , this is an IP address. If the target group type is `LAMBDA` , this is the ARN of a
       * Lambda function. If the target group type is `ALB` , this is the ARN of an Application Load
       * Balancer.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param port The port on which the target is listening.
       * For HTTP, the default is 80. For HTTPS, the default is 443.
       */
      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build(): software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetProperty,
    ) : CdkObject(cdkObject), TargetProperty {
      /**
       * The ID of the target.
       *
       * If the target group type is `INSTANCE` , this is an instance ID. If the target group type
       * is `IP` , this is an IP address. If the target group type is `LAMBDA` , this is the ARN of a
       * Lambda function. If the target group type is `ALB` , this is the ARN of an Application Load
       * Balancer.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-target.html#cfn-vpclattice-targetgroup-target-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The port on which the target is listening.
       *
       * For HTTP, the default is 80. For HTTPS, the default is 443.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-target.html#cfn-vpclattice-targetgroup-target-port)
       */
      override fun port(): Number? = unwrap(this).getPort()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetProperty):
          TargetProperty = CdkObjectWrappers.wrap(cdkObject) as? TargetProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetProperty):
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.vpclattice.CfnTargetGroup.TargetProperty
    }
  }
}
