package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnResourceDefinitionVersionProps {
  /**
   * The ID of the resource definition associated with this version.
   *
   * This value is a GUID.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resourcedefinitionid)
   */
  public fun resourceDefinitionId(): String

  /**
   * The resources in this version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resources)
   */
  public fun resources(): Any

  /**
   * A builder for [CfnResourceDefinitionVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param resourceDefinitionId The ID of the resource definition associated with this version. 
     * This value is a GUID.
     */
    public fun resourceDefinitionId(resourceDefinitionId: String)

    /**
     * @param resources The resources in this version. 
     */
    public fun resources(resources: IResolvable)

    /**
     * @param resources The resources in this version. 
     */
    public fun resources(resources: List<Any>)

    /**
     * @param resources The resources in this version. 
     */
    public fun resources(vararg resources: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps.builder()

    /**
     * @param resourceDefinitionId The ID of the resource definition associated with this version. 
     * This value is a GUID.
     */
    override fun resourceDefinitionId(resourceDefinitionId: String) {
      cdkBuilder.resourceDefinitionId(resourceDefinitionId)
    }

    /**
     * @param resources The resources in this version. 
     */
    override fun resources(resources: IResolvable) {
      cdkBuilder.resources(resources.let(IResolvable::unwrap))
    }

    /**
     * @param resources The resources in this version. 
     */
    override fun resources(resources: List<Any>) {
      cdkBuilder.resources(resources)
    }

    /**
     * @param resources The resources in this version. 
     */
    override fun resources(vararg resources: Any): Unit = resources(resources.toList())

    public fun build(): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps,
  ) : CdkObject(cdkObject), CfnResourceDefinitionVersionProps {
    /**
     * The ID of the resource definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resourcedefinitionid)
     */
    override fun resourceDefinitionId(): String = unwrap(this).getResourceDefinitionId()

    /**
     * The resources in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resources)
     */
    override fun resources(): Any = unwrap(this).getResources()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceDefinitionVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps):
        CfnResourceDefinitionVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceDefinitionVersionProps):
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersionProps
  }
}
