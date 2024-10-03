@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.m2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnApplication`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.m2.*;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
 * .definition(DefinitionProperty.builder()
 * .content("content")
 * .s3Location("s3Location")
 * .build())
 * .engineType("engineType")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .kmsKeyId("kmsKeyId")
 * .roleArn("roleArn")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html)
 */
public interface CfnApplicationProps {
  /**
   * The application definition for a particular application. You can specify either inline JSON or
   * an Amazon S3 bucket location.
   *
   * For information about application definitions, see the [AWS Mainframe Modernization User
   * Guide](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2-definition.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-definition)
   */
  public fun definition(): Any

  /**
   * The description of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The type of the target platform for this application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-enginetype)
   */
  public fun engineType(): String

  /**
   * The identifier of a customer managed key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-kmskeyid)
   */
  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The name of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-name)
   */
  public fun name(): String

  /**
   * The Amazon Resource Name (ARN) of the role associated with the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-rolearn)
   */
  public fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * A builder for [CfnApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param definition The application definition for a particular application. You can specify
     * either inline JSON or an Amazon S3 bucket location. 
     * For information about application definitions, see the [AWS Mainframe Modernization User
     * Guide](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2-definition.html) .
     */
    public fun definition(definition: IResolvable)

    /**
     * @param definition The application definition for a particular application. You can specify
     * either inline JSON or an Amazon S3 bucket location. 
     * For information about application definitions, see the [AWS Mainframe Modernization User
     * Guide](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2-definition.html) .
     */
    public fun definition(definition: CfnApplication.DefinitionProperty)

    /**
     * @param definition The application definition for a particular application. You can specify
     * either inline JSON or an Amazon S3 bucket location. 
     * For information about application definitions, see the [AWS Mainframe Modernization User
     * Guide](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2-definition.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db0d71a903c09c49ec95c15a8b9b87af5e22ba5b3c3d3be9b8d9c60388d4293d")
    public fun definition(definition: CfnApplication.DefinitionProperty.Builder.() -> Unit)

    /**
     * @param description The description of the application.
     */
    public fun description(description: String)

    /**
     * @param engineType The type of the target platform for this application. 
     */
    public fun engineType(engineType: String)

    /**
     * @param kmsKeyId The identifier of a customer managed key.
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * @param name The name of the application. 
     */
    public fun name(name: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the role associated with the application.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.m2.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.m2.CfnApplicationProps.builder()

    /**
     * @param definition The application definition for a particular application. You can specify
     * either inline JSON or an Amazon S3 bucket location. 
     * For information about application definitions, see the [AWS Mainframe Modernization User
     * Guide](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2-definition.html) .
     */
    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param definition The application definition for a particular application. You can specify
     * either inline JSON or an Amazon S3 bucket location. 
     * For information about application definitions, see the [AWS Mainframe Modernization User
     * Guide](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2-definition.html) .
     */
    override fun definition(definition: CfnApplication.DefinitionProperty) {
      cdkBuilder.definition(definition.let(CfnApplication.DefinitionProperty.Companion::unwrap))
    }

    /**
     * @param definition The application definition for a particular application. You can specify
     * either inline JSON or an Amazon S3 bucket location. 
     * For information about application definitions, see the [AWS Mainframe Modernization User
     * Guide](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2-definition.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db0d71a903c09c49ec95c15a8b9b87af5e22ba5b3c3d3be9b8d9c60388d4293d")
    override fun definition(definition: CfnApplication.DefinitionProperty.Builder.() -> Unit): Unit
        = definition(CfnApplication.DefinitionProperty(definition))

    /**
     * @param description The description of the application.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param engineType The type of the target platform for this application. 
     */
    override fun engineType(engineType: String) {
      cdkBuilder.engineType(engineType)
    }

    /**
     * @param kmsKeyId The identifier of a customer managed key.
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * @param name The name of the application. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the role associated with the application.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.m2.CfnApplicationProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.m2.CfnApplicationProps,
  ) : CdkObject(cdkObject),
      CfnApplicationProps {
    /**
     * The application definition for a particular application. You can specify either inline JSON
     * or an Amazon S3 bucket location.
     *
     * For information about application definitions, see the [AWS Mainframe Modernization User
     * Guide](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2-definition.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-definition)
     */
    override fun definition(): Any = unwrap(this).getDefinition()

    /**
     * The description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The type of the target platform for this application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-enginetype)
     */
    override fun engineType(): String = unwrap(this).getEngineType()

    /**
     * The identifier of a customer managed key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-kmskeyid)
     */
    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The Amazon Resource Name (ARN) of the role associated with the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-rolearn)
     */
    override fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.m2.CfnApplicationProps):
        CfnApplicationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnApplicationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.m2.CfnApplicationProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.m2.CfnApplicationProps
  }
}
