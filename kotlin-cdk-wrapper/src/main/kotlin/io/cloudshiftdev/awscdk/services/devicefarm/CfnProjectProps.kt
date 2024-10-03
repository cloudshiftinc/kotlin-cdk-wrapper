@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.devicefarm

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnProject`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.devicefarm.*;
 * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
 * .name("name")
 * // the properties below are optional
 * .defaultJobTimeoutMinutes(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpcConfig(VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .vpcId("vpcId")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html)
 */
public interface CfnProjectProps {
  /**
   * Sets the execution timeout value (in minutes) for a project.
   *
   * All test runs in this project use the specified execution timeout value unless overridden when
   * scheduling a run.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-defaultjobtimeoutminutes)
   */
  public fun defaultJobTimeoutMinutes(): Number? = unwrap(this).getDefaultJobTimeoutMinutes()

  /**
   * The project's name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-name)
   */
  public fun name(): String

  /**
   * The tags to add to the resource.
   *
   * A tag is an array of key-value pairs. Tag keys can have a maximum character length of 128
   * characters. Tag values can have a maximum length of 256 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The VPC security groups and subnets that are attached to a project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-vpcconfig)
   */
  public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

  /**
   * A builder for [CfnProjectProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param defaultJobTimeoutMinutes Sets the execution timeout value (in minutes) for a project.
     * All test runs in this project use the specified execution timeout value unless overridden
     * when scheduling a run.
     */
    public fun defaultJobTimeoutMinutes(defaultJobTimeoutMinutes: Number)

    /**
     * @param name The project's name. 
     */
    public fun name(name: String)

    /**
     * @param tags The tags to add to the resource.
     * A tag is an array of key-value pairs. Tag keys can have a maximum character length of 128
     * characters. Tag values can have a maximum length of 256 characters.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags to add to the resource.
     * A tag is an array of key-value pairs. Tag keys can have a maximum character length of 128
     * characters. Tag values can have a maximum length of 256 characters.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param vpcConfig The VPC security groups and subnets that are attached to a project.
     */
    public fun vpcConfig(vpcConfig: IResolvable)

    /**
     * @param vpcConfig The VPC security groups and subnets that are attached to a project.
     */
    public fun vpcConfig(vpcConfig: CfnProject.VpcConfigProperty)

    /**
     * @param vpcConfig The VPC security groups and subnets that are attached to a project.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02d1a73c3407df2efd09f1531c5376d81f273838fe2f66b19a640d3f41cb3407")
    public fun vpcConfig(vpcConfig: CfnProject.VpcConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.devicefarm.CfnProjectProps.Builder =
        software.amazon.awscdk.services.devicefarm.CfnProjectProps.builder()

    /**
     * @param defaultJobTimeoutMinutes Sets the execution timeout value (in minutes) for a project.
     * All test runs in this project use the specified execution timeout value unless overridden
     * when scheduling a run.
     */
    override fun defaultJobTimeoutMinutes(defaultJobTimeoutMinutes: Number) {
      cdkBuilder.defaultJobTimeoutMinutes(defaultJobTimeoutMinutes)
    }

    /**
     * @param name The project's name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags The tags to add to the resource.
     * A tag is an array of key-value pairs. Tag keys can have a maximum character length of 128
     * characters. Tag values can have a maximum length of 256 characters.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags to add to the resource.
     * A tag is an array of key-value pairs. Tag keys can have a maximum character length of 128
     * characters. Tag values can have a maximum length of 256 characters.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param vpcConfig The VPC security groups and subnets that are attached to a project.
     */
    override fun vpcConfig(vpcConfig: IResolvable) {
      cdkBuilder.vpcConfig(vpcConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param vpcConfig The VPC security groups and subnets that are attached to a project.
     */
    override fun vpcConfig(vpcConfig: CfnProject.VpcConfigProperty) {
      cdkBuilder.vpcConfig(vpcConfig.let(CfnProject.VpcConfigProperty.Companion::unwrap))
    }

    /**
     * @param vpcConfig The VPC security groups and subnets that are attached to a project.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02d1a73c3407df2efd09f1531c5376d81f273838fe2f66b19a640d3f41cb3407")
    override fun vpcConfig(vpcConfig: CfnProject.VpcConfigProperty.Builder.() -> Unit): Unit =
        vpcConfig(CfnProject.VpcConfigProperty(vpcConfig))

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.devicefarm.CfnProjectProps,
  ) : CdkObject(cdkObject),
      CfnProjectProps {
    /**
     * Sets the execution timeout value (in minutes) for a project.
     *
     * All test runs in this project use the specified execution timeout value unless overridden
     * when scheduling a run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-defaultjobtimeoutminutes)
     */
    override fun defaultJobTimeoutMinutes(): Number? = unwrap(this).getDefaultJobTimeoutMinutes()

    /**
     * The project's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The tags to add to the resource.
     *
     * A tag is an array of key-value pairs. Tag keys can have a maximum character length of 128
     * characters. Tag values can have a maximum length of 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The VPC security groups and subnets that are attached to a project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-project.html#cfn-devicefarm-project-vpcconfig)
     */
    override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnProjectProps):
        CfnProjectProps = CdkObjectWrappers.wrap(cdkObject) as? CfnProjectProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnProjectProps):
        software.amazon.awscdk.services.devicefarm.CfnProjectProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.devicefarm.CfnProjectProps
  }
}
