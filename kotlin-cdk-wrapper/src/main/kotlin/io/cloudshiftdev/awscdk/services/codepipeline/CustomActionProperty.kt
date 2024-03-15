@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * The creation attributes used for defining a configuration property of a custom Action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.codepipeline.*;
 * CustomActionProperty customActionProperty = CustomActionProperty.builder()
 * .name("name")
 * .required(false)
 * // the properties below are optional
 * .description("description")
 * .key(false)
 * .queryable(false)
 * .secret(false)
 * .type("type")
 * .build();
 * ```
 */
public interface CustomActionProperty {
  /**
   * The description of the property.
   *
   * Default: the description will be empty
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Whether this property is a key.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-key)
   */
  public fun key(): Boolean? = unwrap(this).getKey()

  /**
   * The name of the property.
   *
   * You use this name in the `configuration` attribute when defining your custom Action class.
   */
  public fun name(): String

  /**
   * Whether this property is queryable.
   *
   * Note that only a single property of a custom Action can be queryable.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-queryable)
   */
  public fun queryable(): Boolean? = unwrap(this).getQueryable()

  /**
   * Whether this property is required.
   */
  public fun required(): Boolean

  /**
   * Whether this property is secret, like a password, or access key.
   *
   * Default: false
   */
  public fun secret(): Boolean? = unwrap(this).getSecret()

  /**
   * The type of the property, like 'String', 'Number', or 'Boolean'.
   *
   * Default: 'String'
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * A builder for [CustomActionProperty]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the property.
     */
    public fun description(description: String)

    /**
     * @param key Whether this property is a key.
     */
    public fun key(key: Boolean)

    /**
     * @param name The name of the property. 
     * You use this name in the `configuration` attribute when defining your custom Action class.
     */
    public fun name(name: String)

    /**
     * @param queryable Whether this property is queryable.
     * Note that only a single property of a custom Action can be queryable.
     */
    public fun queryable(queryable: Boolean)

    /**
     * @param required Whether this property is required. 
     */
    public fun required(required: Boolean)

    /**
     * @param secret Whether this property is secret, like a password, or access key.
     */
    public fun secret(secret: Boolean)

    /**
     * @param type The type of the property, like 'String', 'Number', or 'Boolean'.
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.CustomActionProperty.Builder =
        software.amazon.awscdk.services.codepipeline.CustomActionProperty.builder()

    /**
     * @param description The description of the property.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param key Whether this property is a key.
     */
    override fun key(key: Boolean) {
      cdkBuilder.key(key)
    }

    /**
     * @param name The name of the property. 
     * You use this name in the `configuration` attribute when defining your custom Action class.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param queryable Whether this property is queryable.
     * Note that only a single property of a custom Action can be queryable.
     */
    override fun queryable(queryable: Boolean) {
      cdkBuilder.queryable(queryable)
    }

    /**
     * @param required Whether this property is required. 
     */
    override fun required(required: Boolean) {
      cdkBuilder.required(required)
    }

    /**
     * @param secret Whether this property is secret, like a password, or access key.
     */
    override fun secret(secret: Boolean) {
      cdkBuilder.secret(secret)
    }

    /**
     * @param type The type of the property, like 'String', 'Number', or 'Boolean'.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.CustomActionProperty =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.CustomActionProperty,
  ) : CdkObject(cdkObject), CustomActionProperty {
    /**
     * The description of the property.
     *
     * Default: the description will be empty
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Whether this property is a key.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-key)
     */
    override fun key(): Boolean? = unwrap(this).getKey()

    /**
     * The name of the property.
     *
     * You use this name in the `configuration` attribute when defining your custom Action class.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Whether this property is queryable.
     *
     * Note that only a single property of a custom Action can be queryable.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-customactiontype-configurationproperties.html#cfn-codepipeline-customactiontype-configurationproperties-queryable)
     */
    override fun queryable(): Boolean? = unwrap(this).getQueryable()

    /**
     * Whether this property is required.
     */
    override fun required(): Boolean = unwrap(this).getRequired()

    /**
     * Whether this property is secret, like a password, or access key.
     *
     * Default: false
     */
    override fun secret(): Boolean? = unwrap(this).getSecret()

    /**
     * The type of the property, like 'String', 'Number', or 'Boolean'.
     *
     * Default: 'String'
     */
    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomActionProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CustomActionProperty):
        CustomActionProperty = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomActionProperty):
        software.amazon.awscdk.services.codepipeline.CustomActionProperty = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.CustomActionProperty
  }
}
