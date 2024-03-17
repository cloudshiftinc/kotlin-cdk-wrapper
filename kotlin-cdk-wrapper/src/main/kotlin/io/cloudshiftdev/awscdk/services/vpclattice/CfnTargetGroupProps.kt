@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.vpclattice

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnTargetGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.vpclattice.*;
 * CfnTargetGroupProps cfnTargetGroupProps = CfnTargetGroupProps.builder()
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
public interface CfnTargetGroupProps {
  /**
   * The target group configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-config)
   */
  public fun config(): Any? = unwrap(this).getConfig()

  /**
   * The name of the target group.
   *
   * The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens (-).
   * You can't use a hyphen as the first or last character, or immediately after another hyphen.
   *
   * If you don't specify a name, CloudFormation generates one. However, if you specify a name, and
   * later want to replace the resource, you must specify a new name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The tags for the target group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Describes a target.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-targets)
   */
  public fun targets(): Any? = unwrap(this).getTargets()

  /**
   * The type of target group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnTargetGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param config The target group configuration.
     */
    public fun config(config: IResolvable)

    /**
     * @param config The target group configuration.
     */
    public fun config(config: CfnTargetGroup.TargetGroupConfigProperty)

    /**
     * @param config The target group configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fcc5c025da17d7db1d7bba89e77c4b1829c4a87ecb7a618bb3b9b82fdec0b07")
    public fun config(config: CfnTargetGroup.TargetGroupConfigProperty.Builder.() -> Unit)

    /**
     * @param name The name of the target group.
     * The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens
     * (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     */
    public fun name(name: String)

    /**
     * @param tags The tags for the target group.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags for the target group.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param targets Describes a target.
     */
    public fun targets(targets: IResolvable)

    /**
     * @param targets Describes a target.
     */
    public fun targets(targets: List<Any>)

    /**
     * @param targets Describes a target.
     */
    public fun targets(vararg targets: Any)

    /**
     * @param type The type of target group. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.vpclattice.CfnTargetGroupProps.Builder =
        software.amazon.awscdk.services.vpclattice.CfnTargetGroupProps.builder()

    /**
     * @param config The target group configuration.
     */
    override fun config(config: IResolvable) {
      cdkBuilder.config(config.let(IResolvable::unwrap))
    }

    /**
     * @param config The target group configuration.
     */
    override fun config(config: CfnTargetGroup.TargetGroupConfigProperty) {
      cdkBuilder.config(config.let(CfnTargetGroup.TargetGroupConfigProperty::unwrap))
    }

    /**
     * @param config The target group configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4fcc5c025da17d7db1d7bba89e77c4b1829c4a87ecb7a618bb3b9b82fdec0b07")
    override fun config(config: CfnTargetGroup.TargetGroupConfigProperty.Builder.() -> Unit): Unit =
        config(CfnTargetGroup.TargetGroupConfigProperty(config))

    /**
     * @param name The name of the target group.
     * The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens
     * (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
     *
     * If you don't specify a name, CloudFormation generates one. However, if you specify a name,
     * and later want to replace the resource, you must specify a new name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags for the target group.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags for the target group.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param targets Describes a target.
     */
    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    /**
     * @param targets Describes a target.
     */
    override fun targets(targets: List<Any>) {
      cdkBuilder.targets(targets)
    }

    /**
     * @param targets Describes a target.
     */
    override fun targets(vararg targets: Any): Unit = targets(targets.toList())

    /**
     * @param type The type of target group. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.vpclattice.CfnTargetGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.vpclattice.CfnTargetGroupProps,
  ) : CdkObject(cdkObject), CfnTargetGroupProps {
    /**
     * The target group configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-config)
     */
    override fun config(): Any? = unwrap(this).getConfig()

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
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The tags for the target group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Describes a target.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-targets)
     */
    override fun targets(): Any? = unwrap(this).getTargets()

    /**
     * The type of target group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-vpclattice-targetgroup.html#cfn-vpclattice-targetgroup-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTargetGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.vpclattice.CfnTargetGroupProps):
        CfnTargetGroupProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTargetGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTargetGroupProps):
        software.amazon.awscdk.services.vpclattice.CfnTargetGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.vpclattice.CfnTargetGroupProps
  }
}
