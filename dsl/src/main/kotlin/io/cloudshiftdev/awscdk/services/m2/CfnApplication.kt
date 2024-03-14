package io.cloudshiftdev.awscdk.services.m2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApplication internal constructor(
  private val cdkObject: software.amazon.awscdk.services.m2.CfnApplication,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the application.
   */
  public open fun attrApplicationArn(): String = unwrap(this).getAttrApplicationArn()

  /**
   * The identifier of the application.
   */
  public open fun attrApplicationId(): String = unwrap(this).getAttrApplicationId()

  /**
   * The application definition for a particular application.
   *
   * You can specify either inline JSON or an Amazon S3 bucket location.
   */
  public open fun definition(): Any = unwrap(this).getDefinition()

  /**
   * The application definition for a particular application.
   *
   * You can specify either inline JSON or an Amazon S3 bucket location.
   */
  public open fun definition(`value`: IResolvable) {
    unwrap(this).setDefinition(`value`.let(IResolvable::unwrap))
  }

  /**
   * The application definition for a particular application.
   *
   * You can specify either inline JSON or an Amazon S3 bucket location.
   */
  public open fun definition(`value`: DefinitionProperty) {
    unwrap(this).setDefinition(`value`.let(DefinitionProperty::unwrap))
  }

  /**
   * The application definition for a particular application.
   *
   * You can specify either inline JSON or an Amazon S3 bucket location.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9b624843a9cb8af2a215c414f7f610338f96e0608902203990c9eb54c8ad8952")
  public open fun definition(`value`: DefinitionProperty.Builder.() -> Unit): Unit =
      definition(DefinitionProperty(`value`))

  /**
   * The description of the application.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the application.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The type of the target platform for this application.
   */
  public open fun engineType(): String = unwrap(this).getEngineType()

  /**
   * The type of the target platform for this application.
   */
  public open fun engineType(`value`: String) {
    unwrap(this).setEngineType(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The identifier of a customer managed key.
   */
  public open fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  /**
   * The identifier of a customer managed key.
   */
  public open fun kmsKeyId(`value`: String) {
    unwrap(this).setKmsKeyId(`value`)
  }

  /**
   * The name of the application.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the application.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the role associated with the application.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the role associated with the application.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.m2.CfnApplication].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The application definition for a particular application. You can specify either inline JSON
     * or an Amazon S3 bucket location.
     *
     * For information about application definitions, see the [AWS Mainframe Modernization User
     * Guide](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2-definition.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-definition)
     * @param definition The application definition for a particular application. You can specify
     * either inline JSON or an Amazon S3 bucket location. 
     */
    public fun definition(definition: IResolvable)

    /**
     * The application definition for a particular application. You can specify either inline JSON
     * or an Amazon S3 bucket location.
     *
     * For information about application definitions, see the [AWS Mainframe Modernization User
     * Guide](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2-definition.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-definition)
     * @param definition The application definition for a particular application. You can specify
     * either inline JSON or an Amazon S3 bucket location. 
     */
    public fun definition(definition: DefinitionProperty)

    /**
     * The application definition for a particular application. You can specify either inline JSON
     * or an Amazon S3 bucket location.
     *
     * For information about application definitions, see the [AWS Mainframe Modernization User
     * Guide](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2-definition.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-definition)
     * @param definition The application definition for a particular application. You can specify
     * either inline JSON or an Amazon S3 bucket location. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa07a797264e8a049043822049769f620ab982b21b833a0a72617a2a86d9255c")
    public fun definition(definition: DefinitionProperty.Builder.() -> Unit)

    /**
     * The description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-description)
     * @param description The description of the application. 
     */
    public fun description(description: String)

    /**
     * The type of the target platform for this application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-enginetype)
     * @param engineType The type of the target platform for this application. 
     */
    public fun engineType(engineType: String)

    /**
     * The identifier of a customer managed key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-kmskeyid)
     * @param kmsKeyId The identifier of a customer managed key. 
     */
    public fun kmsKeyId(kmsKeyId: String)

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-name)
     * @param name The name of the application. 
     */
    public fun name(name: String)

    /**
     * The Amazon Resource Name (ARN) of the role associated with the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the role associated with the application. 
     */
    public fun roleArn(roleArn: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.m2.CfnApplication.Builder =
        software.amazon.awscdk.services.m2.CfnApplication.Builder.create(scope, id)

    /**
     * The application definition for a particular application. You can specify either inline JSON
     * or an Amazon S3 bucket location.
     *
     * For information about application definitions, see the [AWS Mainframe Modernization User
     * Guide](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2-definition.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-definition)
     * @param definition The application definition for a particular application. You can specify
     * either inline JSON or an Amazon S3 bucket location. 
     */
    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    /**
     * The application definition for a particular application. You can specify either inline JSON
     * or an Amazon S3 bucket location.
     *
     * For information about application definitions, see the [AWS Mainframe Modernization User
     * Guide](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2-definition.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-definition)
     * @param definition The application definition for a particular application. You can specify
     * either inline JSON or an Amazon S3 bucket location. 
     */
    override fun definition(definition: DefinitionProperty) {
      cdkBuilder.definition(definition.let(DefinitionProperty::unwrap))
    }

    /**
     * The application definition for a particular application. You can specify either inline JSON
     * or an Amazon S3 bucket location.
     *
     * For information about application definitions, see the [AWS Mainframe Modernization User
     * Guide](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2-definition.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-definition)
     * @param definition The application definition for a particular application. You can specify
     * either inline JSON or an Amazon S3 bucket location. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fa07a797264e8a049043822049769f620ab982b21b833a0a72617a2a86d9255c")
    override fun definition(definition: DefinitionProperty.Builder.() -> Unit): Unit =
        definition(DefinitionProperty(definition))

    /**
     * The description of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-description)
     * @param description The description of the application. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The type of the target platform for this application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-enginetype)
     * @param engineType The type of the target platform for this application. 
     */
    override fun engineType(engineType: String) {
      cdkBuilder.engineType(engineType)
    }

    /**
     * The identifier of a customer managed key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-kmskeyid)
     * @param kmsKeyId The identifier of a customer managed key. 
     */
    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-name)
     * @param name The name of the application. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The Amazon Resource Name (ARN) of the role associated with the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the role associated with the application. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-m2-application.html#cfn-m2-application-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.m2.CfnApplication = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplication {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplication(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.m2.CfnApplication): CfnApplication
        = CfnApplication(cdkObject)

    internal fun unwrap(wrapped: CfnApplication): software.amazon.awscdk.services.m2.CfnApplication
        = wrapped.cdkObject
  }

  public interface DefinitionProperty {
    /**
     * The content of the application definition.
     *
     * This is a JSON object that contains the resource configuration/definitions that identify an
     * application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-application-definition.html#cfn-m2-application-definition-content)
     */
    public fun content(): String? = unwrap(this).getContent()

    /**
     * The S3 bucket that contains the application definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-application-definition.html#cfn-m2-application-definition-s3location)
     */
    public fun s3Location(): String? = unwrap(this).getS3Location()

    /**
     * A builder for [DefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param content The content of the application definition.
       * This is a JSON object that contains the resource configuration/definitions that identify an
       * application.
       */
      public fun content(content: String)

      /**
       * @param s3Location The S3 bucket that contains the application definition.
       */
      public fun s3Location(s3Location: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.m2.CfnApplication.DefinitionProperty.Builder =
          software.amazon.awscdk.services.m2.CfnApplication.DefinitionProperty.builder()

      /**
       * @param content The content of the application definition.
       * This is a JSON object that contains the resource configuration/definitions that identify an
       * application.
       */
      override fun content(content: String) {
        cdkBuilder.content(content)
      }

      /**
       * @param s3Location The S3 bucket that contains the application definition.
       */
      override fun s3Location(s3Location: String) {
        cdkBuilder.s3Location(s3Location)
      }

      public fun build(): software.amazon.awscdk.services.m2.CfnApplication.DefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.m2.CfnApplication.DefinitionProperty,
    ) : DefinitionProperty {
      /**
       * The content of the application definition.
       *
       * This is a JSON object that contains the resource configuration/definitions that identify an
       * application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-application-definition.html#cfn-m2-application-definition-content)
       */
      override fun content(): String? = unwrap(this).getContent()

      /**
       * The S3 bucket that contains the application definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-m2-application-definition.html#cfn-m2-application-definition-s3location)
       */
      override fun s3Location(): String? = unwrap(this).getS3Location()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.m2.CfnApplication.DefinitionProperty):
          DefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefinitionProperty):
          software.amazon.awscdk.services.m2.CfnApplication.DefinitionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
