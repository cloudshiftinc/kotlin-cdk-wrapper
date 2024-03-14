package io.cloudshiftdev.awscdk.services.fms

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnResourceSetProps {
  /**
   * A description of the resource set.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The descriptive name of the resource set.
   *
   * You can't change the name of a resource set after you create it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-name)
   */
  public fun name(): String

  /**
   * Determines the resources that can be associated to the resource set.
   *
   * Depending on your setting for max results and the number of resource sets, a single call might
   * not return the full list.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-resourcetypelist)
   */
  public fun resourceTypeList(): List<String>

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-resources)
   */
  public fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnResourceSetProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the resource set.
     */
    public fun description(description: String)

    /**
     * @param name The descriptive name of the resource set. 
     * You can't change the name of a resource set after you create it.
     */
    public fun name(name: String)

    /**
     * @param resourceTypeList Determines the resources that can be associated to the resource set. 
     * Depending on your setting for max results and the number of resource sets, a single call
     * might not return the full list.
     */
    public fun resourceTypeList(resourceTypeList: List<String>)

    /**
     * @param resourceTypeList Determines the resources that can be associated to the resource set. 
     * Depending on your setting for max results and the number of resource sets, a single call
     * might not return the full list.
     */
    public fun resourceTypeList(vararg resourceTypeList: String)

    /**
     * @param resources the value to be set.
     */
    public fun resources(resources: List<String>)

    /**
     * @param resources the value to be set.
     */
    public fun resources(vararg resources: String)

    /**
     * @param tags the value to be set.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags the value to be set.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.fms.CfnResourceSetProps.Builder =
        software.amazon.awscdk.services.fms.CfnResourceSetProps.builder()

    /**
     * @param description A description of the resource set.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The descriptive name of the resource set. 
     * You can't change the name of a resource set after you create it.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param resourceTypeList Determines the resources that can be associated to the resource set. 
     * Depending on your setting for max results and the number of resource sets, a single call
     * might not return the full list.
     */
    override fun resourceTypeList(resourceTypeList: List<String>) {
      cdkBuilder.resourceTypeList(resourceTypeList)
    }

    /**
     * @param resourceTypeList Determines the resources that can be associated to the resource set. 
     * Depending on your setting for max results and the number of resource sets, a single call
     * might not return the full list.
     */
    override fun resourceTypeList(vararg resourceTypeList: String): Unit =
        resourceTypeList(resourceTypeList.toList())

    /**
     * @param resources the value to be set.
     */
    override fun resources(resources: List<String>) {
      cdkBuilder.resources(resources)
    }

    /**
     * @param resources the value to be set.
     */
    override fun resources(vararg resources: String): Unit = resources(resources.toList())

    /**
     * @param tags the value to be set.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags the value to be set.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.fms.CfnResourceSetProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.fms.CfnResourceSetProps,
  ) : CdkObject(cdkObject), CfnResourceSetProps {
    /**
     * A description of the resource set.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The descriptive name of the resource set.
     *
     * You can't change the name of a resource set after you create it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Determines the resources that can be associated to the resource set.
     *
     * Depending on your setting for max results and the number of resource sets, a single call
     * might not return the full list.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-resourcetypelist)
     */
    override fun resourceTypeList(): List<String> = unwrap(this).getResourceTypeList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-resources)
     */
    override fun resources(): List<String> = unwrap(this).getResources() ?: emptyList()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fms-resourceset.html#cfn-fms-resourceset-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceSetProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.fms.CfnResourceSetProps):
        CfnResourceSetProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceSetProps):
        software.amazon.awscdk.services.fms.CfnResourceSetProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.fms.CfnResourceSetProps
  }
}
