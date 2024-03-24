@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnCoreDefinitionVersion`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrass.*;
 * CfnCoreDefinitionVersionProps cfnCoreDefinitionVersionProps =
 * CfnCoreDefinitionVersionProps.builder()
 * .coreDefinitionId("coreDefinitionId")
 * .cores(List.of(CoreProperty.builder()
 * .certificateArn("certificateArn")
 * .id("id")
 * .thingArn("thingArn")
 * // the properties below are optional
 * .syncShadow(false)
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html)
 */
public interface CfnCoreDefinitionVersionProps {
  /**
   * The ID of the core definition associated with this version.
   *
   * This value is a GUID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-coredefinitionid)
   */
  public fun coreDefinitionId(): String

  /**
   * The Greengrass core in this version.
   *
   * Currently, the `Cores` property for a core definition version can contain only one core.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-cores)
   */
  public fun cores(): Any

  /**
   * A builder for [CfnCoreDefinitionVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param coreDefinitionId The ID of the core definition associated with this version. 
     * This value is a GUID.
     */
    public fun coreDefinitionId(coreDefinitionId: String)

    /**
     * @param cores The Greengrass core in this version. 
     * Currently, the `Cores` property for a core definition version can contain only one core.
     */
    public fun cores(cores: IResolvable)

    /**
     * @param cores The Greengrass core in this version. 
     * Currently, the `Cores` property for a core definition version can contain only one core.
     */
    public fun cores(cores: List<Any>)

    /**
     * @param cores The Greengrass core in this version. 
     * Currently, the `Cores` property for a core definition version can contain only one core.
     */
    public fun cores(vararg cores: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps.builder()

    /**
     * @param coreDefinitionId The ID of the core definition associated with this version. 
     * This value is a GUID.
     */
    override fun coreDefinitionId(coreDefinitionId: String) {
      cdkBuilder.coreDefinitionId(coreDefinitionId)
    }

    /**
     * @param cores The Greengrass core in this version. 
     * Currently, the `Cores` property for a core definition version can contain only one core.
     */
    override fun cores(cores: IResolvable) {
      cdkBuilder.cores(cores.let(IResolvable::unwrap))
    }

    /**
     * @param cores The Greengrass core in this version. 
     * Currently, the `Cores` property for a core definition version can contain only one core.
     */
    override fun cores(cores: List<Any>) {
      cdkBuilder.cores(cores.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param cores The Greengrass core in this version. 
     * Currently, the `Cores` property for a core definition version can contain only one core.
     */
    override fun cores(vararg cores: Any): Unit = cores(cores.toList())

    public fun build(): software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps,
  ) : CdkObject(cdkObject), CfnCoreDefinitionVersionProps {
    /**
     * The ID of the core definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-coredefinitionid)
     */
    override fun coreDefinitionId(): String = unwrap(this).getCoreDefinitionId()

    /**
     * The Greengrass core in this version.
     *
     * Currently, the `Cores` property for a core definition version can contain only one core.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-coredefinitionversion.html#cfn-greengrass-coredefinitionversion-cores)
     */
    override fun cores(): Any = unwrap(this).getCores()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCoreDefinitionVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps):
        CfnCoreDefinitionVersionProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnCoreDefinitionVersionProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCoreDefinitionVersionProps):
        software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.greengrass.CfnCoreDefinitionVersionProps
  }
}
