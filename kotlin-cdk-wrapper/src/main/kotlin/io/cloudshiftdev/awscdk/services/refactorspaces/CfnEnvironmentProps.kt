@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.refactorspaces

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnEnvironment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.refactorspaces.*;
 * CfnEnvironmentProps cfnEnvironmentProps = CfnEnvironmentProps.builder()
 * .name("name")
 * .networkFabricType("networkFabricType")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html)
 */
public interface CfnEnvironmentProps {
  /**
   * A description of the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-name)
   */
  public fun name(): String

  /**
   * The network fabric type of the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-networkfabrictype)
   */
  public fun networkFabricType(): String

  /**
   * The tags assigned to the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnEnvironmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the environment.
     */
    public fun description(description: String)

    /**
     * @param name The name of the environment. 
     */
    public fun name(name: String)

    /**
     * @param networkFabricType The network fabric type of the environment. 
     */
    public fun networkFabricType(networkFabricType: String)

    /**
     * @param tags The tags assigned to the environment.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags assigned to the environment.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.refactorspaces.CfnEnvironmentProps.Builder =
        software.amazon.awscdk.services.refactorspaces.CfnEnvironmentProps.builder()

    /**
     * @param description A description of the environment.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the environment. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param networkFabricType The network fabric type of the environment. 
     */
    override fun networkFabricType(networkFabricType: String) {
      cdkBuilder.networkFabricType(networkFabricType)
    }

    /**
     * @param tags The tags assigned to the environment.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags assigned to the environment.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.refactorspaces.CfnEnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.refactorspaces.CfnEnvironmentProps,
  ) : CdkObject(cdkObject), CfnEnvironmentProps {
    /**
     * A description of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The network fabric type of the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-networkfabrictype)
     */
    override fun networkFabricType(): String = unwrap(this).getNetworkFabricType()

    /**
     * The tags assigned to the environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html#cfn-refactorspaces-environment-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnEnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.refactorspaces.CfnEnvironmentProps):
        CfnEnvironmentProps = CdkObjectWrappers.wrap(cdkObject) as? CfnEnvironmentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnEnvironmentProps):
        software.amazon.awscdk.services.refactorspaces.CfnEnvironmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.refactorspaces.CfnEnvironmentProps
  }
}
