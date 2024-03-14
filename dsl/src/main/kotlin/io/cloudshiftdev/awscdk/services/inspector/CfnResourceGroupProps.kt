package io.cloudshiftdev.awscdk.services.inspector

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Unit
import kotlin.collections.List

public interface CfnResourceGroupProps {
  /**
   * The tags (key and value pairs) that will be associated with the resource group.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html#cfn-inspector-resourcegroup-resourcegrouptags)
   */
  public fun resourceGroupTags(): Any

  /**
   * A builder for [CfnResourceGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param resourceGroupTags The tags (key and value pairs) that will be associated with the
     * resource group. 
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun resourceGroupTags(resourceGroupTags: IResolvable)

    /**
     * @param resourceGroupTags The tags (key and value pairs) that will be associated with the
     * resource group. 
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun resourceGroupTags(resourceGroupTags: List<Any>)

    /**
     * @param resourceGroupTags The tags (key and value pairs) that will be associated with the
     * resource group. 
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun resourceGroupTags(vararg resourceGroupTags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.inspector.CfnResourceGroupProps.Builder
        = software.amazon.awscdk.services.inspector.CfnResourceGroupProps.builder()

    /**
     * @param resourceGroupTags The tags (key and value pairs) that will be associated with the
     * resource group. 
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun resourceGroupTags(resourceGroupTags: IResolvable) {
      cdkBuilder.resourceGroupTags(resourceGroupTags.let(IResolvable::unwrap))
    }

    /**
     * @param resourceGroupTags The tags (key and value pairs) that will be associated with the
     * resource group. 
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun resourceGroupTags(resourceGroupTags: List<Any>) {
      cdkBuilder.resourceGroupTags(resourceGroupTags)
    }

    /**
     * @param resourceGroupTags The tags (key and value pairs) that will be associated with the
     * resource group. 
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun resourceGroupTags(vararg resourceGroupTags: Any): Unit =
        resourceGroupTags(resourceGroupTags.toList())

    public fun build(): software.amazon.awscdk.services.inspector.CfnResourceGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.inspector.CfnResourceGroupProps,
  ) : CdkObject(cdkObject), CfnResourceGroupProps {
    /**
     * The tags (key and value pairs) that will be associated with the resource group.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-inspector-resourcegroup.html#cfn-inspector-resourcegroup-resourcegrouptags)
     */
    override fun resourceGroupTags(): Any = unwrap(this).getResourceGroupTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.inspector.CfnResourceGroupProps):
        CfnResourceGroupProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceGroupProps):
        software.amazon.awscdk.services.inspector.CfnResourceGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.inspector.CfnResourceGroupProps
  }
}
