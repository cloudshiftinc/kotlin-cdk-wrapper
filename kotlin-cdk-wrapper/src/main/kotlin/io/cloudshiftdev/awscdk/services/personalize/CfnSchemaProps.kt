@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.personalize

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnSchema`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.personalize.*;
 * CfnSchemaProps cfnSchemaProps = CfnSchemaProps.builder()
 * .name("name")
 * .schema("schema")
 * // the properties below are optional
 * .domain("domain")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html)
 */
public interface CfnSchemaProps {
  /**
   * The domain of a schema that you created for a dataset in a Domain dataset group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html#cfn-personalize-schema-domain)
   */
  public fun domain(): String? = unwrap(this).getDomain()

  /**
   * The name of the schema.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html#cfn-personalize-schema-name)
   */
  public fun name(): String

  /**
   * The schema.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html#cfn-personalize-schema-schema)
   */
  public fun schema(): String

  /**
   * A builder for [CfnSchemaProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param domain The domain of a schema that you created for a dataset in a Domain dataset
     * group.
     */
    public fun domain(domain: String)

    /**
     * @param name The name of the schema. 
     */
    public fun name(name: String)

    /**
     * @param schema The schema. 
     */
    public fun schema(schema: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.personalize.CfnSchemaProps.Builder =
        software.amazon.awscdk.services.personalize.CfnSchemaProps.builder()

    /**
     * @param domain The domain of a schema that you created for a dataset in a Domain dataset
     * group.
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * @param name The name of the schema. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param schema The schema. 
     */
    override fun schema(schema: String) {
      cdkBuilder.schema(schema)
    }

    public fun build(): software.amazon.awscdk.services.personalize.CfnSchemaProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.personalize.CfnSchemaProps,
  ) : CdkObject(cdkObject),
      CfnSchemaProps {
    /**
     * The domain of a schema that you created for a dataset in a Domain dataset group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html#cfn-personalize-schema-domain)
     */
    override fun domain(): String? = unwrap(this).getDomain()

    /**
     * The name of the schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html#cfn-personalize-schema-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The schema.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-personalize-schema.html#cfn-personalize-schema-schema)
     */
    override fun schema(): String = unwrap(this).getSchema()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSchemaProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSchemaProps):
        CfnSchemaProps = CdkObjectWrappers.wrap(cdkObject) as? CfnSchemaProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSchemaProps):
        software.amazon.awscdk.services.personalize.CfnSchemaProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.personalize.CfnSchemaProps
  }
}
