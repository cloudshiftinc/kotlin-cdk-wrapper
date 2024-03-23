@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalogappregistry

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

/**
 * Properties for defining a `CfnApplication`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.servicecatalogappregistry.*;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-application.html)
 */
public interface CfnApplicationProps {
  /**
   * The description of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-application.html#cfn-servicecatalogappregistry-application-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the application.
   *
   * The name must be unique in the region in which you are creating the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-application.html#cfn-servicecatalogappregistry-application-name)
   */
  public fun name(): String

  /**
   * Key-value pairs you can use to associate with the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-application.html#cfn-servicecatalogappregistry-application-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the application.
     */
    public fun description(description: String)

    /**
     * @param name The name of the application. 
     * The name must be unique in the region in which you are creating the application.
     */
    public fun name(name: String)

    /**
     * @param tags Key-value pairs you can use to associate with the application.
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.servicecatalogappregistry.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.servicecatalogappregistry.CfnApplicationProps.builder()

    /**
     * @param description The description of the application.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the application. 
     * The name must be unique in the region in which you are creating the application.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Key-value pairs you can use to associate with the application.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build():
        software.amazon.awscdk.services.servicecatalogappregistry.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.servicecatalogappregistry.CfnApplicationProps,
  ) : CdkObject(cdkObject), CfnApplicationProps {
    /**
     * The description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-application.html#cfn-servicecatalogappregistry-application-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the application.
     *
     * The name must be unique in the region in which you are creating the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-application.html#cfn-servicecatalogappregistry-application-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Key-value pairs you can use to associate with the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalogappregistry-application.html#cfn-servicecatalogappregistry-application-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalogappregistry.CfnApplicationProps):
        CfnApplicationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnApplicationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.servicecatalogappregistry.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalogappregistry.CfnApplicationProps
  }
}
