@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.qbusiness

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Adds a retriever to your Amazon Q Business application.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.qbusiness.*;
 * CfnRetriever cfnRetriever = CfnRetriever.Builder.create(this, "MyCfnRetriever")
 * .applicationId("applicationId")
 * .configuration(RetrieverConfigurationProperty.builder()
 * .kendraIndexConfiguration(KendraIndexConfigurationProperty.builder()
 * .indexId("indexId")
 * .build())
 * .nativeIndexConfiguration(NativeIndexConfigurationProperty.builder()
 * .indexId("indexId")
 * .build())
 * .build())
 * .displayName("displayName")
 * .type("type")
 * // the properties below are optional
 * .roleArn("roleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html)
 */
public open class CfnRetriever(
  cdkObject: software.amazon.awscdk.services.qbusiness.CfnRetriever,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRetrieverProps,
  ) :
      this(software.amazon.awscdk.services.qbusiness.CfnRetriever(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnRetrieverProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnRetrieverProps.Builder.() -> Unit,
  ) : this(scope, id, CfnRetrieverProps(props)
  )

  /**
   * The identifier of the Amazon Q Business application using the retriever.
   */
  public open fun applicationId(): String = unwrap(this).getApplicationId()

  /**
   * The identifier of the Amazon Q Business application using the retriever.
   */
  public open fun applicationId(`value`: String) {
    unwrap(this).setApplicationId(`value`)
  }

  /**
   * The Unix timestamp when the retriever was created.
   */
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  /**
   * The Amazon Resource Name (ARN) of the IAM role associated with the retriever.
   */
  public open fun attrRetrieverArn(): String = unwrap(this).getAttrRetrieverArn()

  /**
   * The identifier of the retriever used by your Amazon Q Business application.
   */
  public open fun attrRetrieverId(): String = unwrap(this).getAttrRetrieverId()

  /**
   * The status of your retriever.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The Unix timestamp when the retriever was last updated.
   */
  public open fun attrUpdatedAt(): String = unwrap(this).getAttrUpdatedAt()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Provides information on how the retriever used for your Amazon Q Business application is
   * configured.
   */
  public open fun configuration(): Any = unwrap(this).getConfiguration()

  /**
   * Provides information on how the retriever used for your Amazon Q Business application is
   * configured.
   */
  public open fun configuration(`value`: IResolvable) {
    unwrap(this).setConfiguration(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Provides information on how the retriever used for your Amazon Q Business application is
   * configured.
   */
  public open fun configuration(`value`: RetrieverConfigurationProperty) {
    unwrap(this).setConfiguration(`value`.let(RetrieverConfigurationProperty.Companion::unwrap))
  }

  /**
   * Provides information on how the retriever used for your Amazon Q Business application is
   * configured.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("1a3bcca7b2ae39291415018f3aa08be5283de3919857551dfd3778a3231ec976")
  public open fun configuration(`value`: RetrieverConfigurationProperty.Builder.() -> Unit): Unit =
      configuration(RetrieverConfigurationProperty(`value`))

  /**
   * The name of your retriever.
   */
  public open fun displayName(): String = unwrap(this).getDisplayName()

  /**
   * The name of your retriever.
   */
  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The ARN of an IAM role used by Amazon Q Business to access the basic authentication credentials
   * stored in a Secrets Manager secret.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The ARN of an IAM role used by Amazon Q Business to access the basic authentication credentials
   * stored in a Secrets Manager secret.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * A list of key-value pairs that identify or categorize the retriever.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A list of key-value pairs that identify or categorize the retriever.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * A list of key-value pairs that identify or categorize the retriever.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The type of your retriever.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of your retriever.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.qbusiness.CfnRetriever].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of the Amazon Q Business application using the retriever.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-applicationid)
     * @param applicationId The identifier of the Amazon Q Business application using the retriever.
     * 
     */
    public fun applicationId(applicationId: String)

    /**
     * Provides information on how the retriever used for your Amazon Q Business application is
     * configured.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-configuration)
     * @param configuration Provides information on how the retriever used for your Amazon Q
     * Business application is configured. 
     */
    public fun configuration(configuration: IResolvable)

    /**
     * Provides information on how the retriever used for your Amazon Q Business application is
     * configured.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-configuration)
     * @param configuration Provides information on how the retriever used for your Amazon Q
     * Business application is configured. 
     */
    public fun configuration(configuration: RetrieverConfigurationProperty)

    /**
     * Provides information on how the retriever used for your Amazon Q Business application is
     * configured.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-configuration)
     * @param configuration Provides information on how the retriever used for your Amazon Q
     * Business application is configured. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8be2d02ae3bbf49dea6f954c43eac0c92d31779a872804d0aafeffbce8fc462f")
    public fun configuration(configuration: RetrieverConfigurationProperty.Builder.() -> Unit)

    /**
     * The name of your retriever.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-displayname)
     * @param displayName The name of your retriever. 
     */
    public fun displayName(displayName: String)

    /**
     * The ARN of an IAM role used by Amazon Q Business to access the basic authentication
     * credentials stored in a Secrets Manager secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-rolearn)
     * @param roleArn The ARN of an IAM role used by Amazon Q Business to access the basic
     * authentication credentials stored in a Secrets Manager secret. 
     */
    public fun roleArn(roleArn: String)

    /**
     * A list of key-value pairs that identify or categorize the retriever.
     *
     * You can also use tags to help control access to the retriever. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-tags)
     * @param tags A list of key-value pairs that identify or categorize the retriever. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * A list of key-value pairs that identify or categorize the retriever.
     *
     * You can also use tags to help control access to the retriever. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-tags)
     * @param tags A list of key-value pairs that identify or categorize the retriever. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of your retriever.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-type)
     * @param type The type of your retriever. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.qbusiness.CfnRetriever.Builder =
        software.amazon.awscdk.services.qbusiness.CfnRetriever.Builder.create(scope, id)

    /**
     * The identifier of the Amazon Q Business application using the retriever.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-applicationid)
     * @param applicationId The identifier of the Amazon Q Business application using the retriever.
     * 
     */
    override fun applicationId(applicationId: String) {
      cdkBuilder.applicationId(applicationId)
    }

    /**
     * Provides information on how the retriever used for your Amazon Q Business application is
     * configured.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-configuration)
     * @param configuration Provides information on how the retriever used for your Amazon Q
     * Business application is configured. 
     */
    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable.Companion::unwrap))
    }

    /**
     * Provides information on how the retriever used for your Amazon Q Business application is
     * configured.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-configuration)
     * @param configuration Provides information on how the retriever used for your Amazon Q
     * Business application is configured. 
     */
    override fun configuration(configuration: RetrieverConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(RetrieverConfigurationProperty.Companion::unwrap))
    }

    /**
     * Provides information on how the retriever used for your Amazon Q Business application is
     * configured.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-configuration)
     * @param configuration Provides information on how the retriever used for your Amazon Q
     * Business application is configured. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8be2d02ae3bbf49dea6f954c43eac0c92d31779a872804d0aafeffbce8fc462f")
    override fun configuration(configuration: RetrieverConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(RetrieverConfigurationProperty(configuration))

    /**
     * The name of your retriever.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-displayname)
     * @param displayName The name of your retriever. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * The ARN of an IAM role used by Amazon Q Business to access the basic authentication
     * credentials stored in a Secrets Manager secret.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-rolearn)
     * @param roleArn The ARN of an IAM role used by Amazon Q Business to access the basic
     * authentication credentials stored in a Secrets Manager secret. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * A list of key-value pairs that identify or categorize the retriever.
     *
     * You can also use tags to help control access to the retriever. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-tags)
     * @param tags A list of key-value pairs that identify or categorize the retriever. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * A list of key-value pairs that identify or categorize the retriever.
     *
     * You can also use tags to help control access to the retriever. Tag keys and values can
     * consist of Unicode letters, digits, white space, and any of the following symbols: _ . : / = + -
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-tags)
     * @param tags A list of key-value pairs that identify or categorize the retriever. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of your retriever.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-qbusiness-retriever.html#cfn-qbusiness-retriever-type)
     * @param type The type of your retriever. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.qbusiness.CfnRetriever = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.qbusiness.CfnRetriever.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnRetriever {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnRetriever(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnRetriever):
        CfnRetriever = CfnRetriever(cdkObject)

    internal fun unwrap(wrapped: CfnRetriever):
        software.amazon.awscdk.services.qbusiness.CfnRetriever = wrapped.cdkObject as
        software.amazon.awscdk.services.qbusiness.CfnRetriever
  }

  /**
   * Stores an Amazon Kendra index as a retriever.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * KendraIndexConfigurationProperty kendraIndexConfigurationProperty =
   * KendraIndexConfigurationProperty.builder()
   * .indexId("indexId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-retriever-kendraindexconfiguration.html)
   */
  public interface KendraIndexConfigurationProperty {
    /**
     * The identifier of the Amazon Kendra index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-retriever-kendraindexconfiguration.html#cfn-qbusiness-retriever-kendraindexconfiguration-indexid)
     */
    public fun indexId(): String

    /**
     * A builder for [KendraIndexConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param indexId The identifier of the Amazon Kendra index. 
       */
      public fun indexId(indexId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnRetriever.KendraIndexConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnRetriever.KendraIndexConfigurationProperty.builder()

      /**
       * @param indexId The identifier of the Amazon Kendra index. 
       */
      override fun indexId(indexId: String) {
        cdkBuilder.indexId(indexId)
      }

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnRetriever.KendraIndexConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnRetriever.KendraIndexConfigurationProperty,
    ) : CdkObject(cdkObject),
        KendraIndexConfigurationProperty {
      /**
       * The identifier of the Amazon Kendra index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-retriever-kendraindexconfiguration.html#cfn-qbusiness-retriever-kendraindexconfiguration-indexid)
       */
      override fun indexId(): String = unwrap(this).getIndexId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): KendraIndexConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnRetriever.KendraIndexConfigurationProperty):
          KendraIndexConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          KendraIndexConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: KendraIndexConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnRetriever.KendraIndexConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnRetriever.KendraIndexConfigurationProperty
    }
  }

  /**
   * Configuration information for an Amazon Q Business index.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * NativeIndexConfigurationProperty nativeIndexConfigurationProperty =
   * NativeIndexConfigurationProperty.builder()
   * .indexId("indexId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-retriever-nativeindexconfiguration.html)
   */
  public interface NativeIndexConfigurationProperty {
    /**
     * The identifier for the Amazon Q Business index.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-retriever-nativeindexconfiguration.html#cfn-qbusiness-retriever-nativeindexconfiguration-indexid)
     */
    public fun indexId(): String

    /**
     * A builder for [NativeIndexConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param indexId The identifier for the Amazon Q Business index. 
       */
      public fun indexId(indexId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnRetriever.NativeIndexConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnRetriever.NativeIndexConfigurationProperty.builder()

      /**
       * @param indexId The identifier for the Amazon Q Business index. 
       */
      override fun indexId(indexId: String) {
        cdkBuilder.indexId(indexId)
      }

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnRetriever.NativeIndexConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnRetriever.NativeIndexConfigurationProperty,
    ) : CdkObject(cdkObject),
        NativeIndexConfigurationProperty {
      /**
       * The identifier for the Amazon Q Business index.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-retriever-nativeindexconfiguration.html#cfn-qbusiness-retriever-nativeindexconfiguration-indexid)
       */
      override fun indexId(): String = unwrap(this).getIndexId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NativeIndexConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnRetriever.NativeIndexConfigurationProperty):
          NativeIndexConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NativeIndexConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NativeIndexConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnRetriever.NativeIndexConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnRetriever.NativeIndexConfigurationProperty
    }
  }

  /**
   * Provides information on how the retriever used for your Amazon Q Business application is
   * configured.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.qbusiness.*;
   * RetrieverConfigurationProperty retrieverConfigurationProperty =
   * RetrieverConfigurationProperty.builder()
   * .kendraIndexConfiguration(KendraIndexConfigurationProperty.builder()
   * .indexId("indexId")
   * .build())
   * .nativeIndexConfiguration(NativeIndexConfigurationProperty.builder()
   * .indexId("indexId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-retriever-retrieverconfiguration.html)
   */
  public interface RetrieverConfigurationProperty {
    /**
     * Provides information on how the Amazon Kendra index used as a retriever for your Amazon Q
     * Business application is configured.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-retriever-retrieverconfiguration.html#cfn-qbusiness-retriever-retrieverconfiguration-kendraindexconfiguration)
     */
    public fun kendraIndexConfiguration(): Any? = unwrap(this).getKendraIndexConfiguration()

    /**
     * Provides information on how a Amazon Q Business index used as a retriever for your Amazon Q
     * Business application is configured.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-retriever-retrieverconfiguration.html#cfn-qbusiness-retriever-retrieverconfiguration-nativeindexconfiguration)
     */
    public fun nativeIndexConfiguration(): Any? = unwrap(this).getNativeIndexConfiguration()

    /**
     * A builder for [RetrieverConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kendraIndexConfiguration Provides information on how the Amazon Kendra index used as
       * a retriever for your Amazon Q Business application is configured.
       */
      public fun kendraIndexConfiguration(kendraIndexConfiguration: IResolvable)

      /**
       * @param kendraIndexConfiguration Provides information on how the Amazon Kendra index used as
       * a retriever for your Amazon Q Business application is configured.
       */
      public
          fun kendraIndexConfiguration(kendraIndexConfiguration: KendraIndexConfigurationProperty)

      /**
       * @param kendraIndexConfiguration Provides information on how the Amazon Kendra index used as
       * a retriever for your Amazon Q Business application is configured.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dcde63325e6dbb891a0529453793391f1987522b65304fd152bf13fcd6f65f6e")
      public
          fun kendraIndexConfiguration(kendraIndexConfiguration: KendraIndexConfigurationProperty.Builder.() -> Unit)

      /**
       * @param nativeIndexConfiguration Provides information on how a Amazon Q Business index used
       * as a retriever for your Amazon Q Business application is configured.
       */
      public fun nativeIndexConfiguration(nativeIndexConfiguration: IResolvable)

      /**
       * @param nativeIndexConfiguration Provides information on how a Amazon Q Business index used
       * as a retriever for your Amazon Q Business application is configured.
       */
      public
          fun nativeIndexConfiguration(nativeIndexConfiguration: NativeIndexConfigurationProperty)

      /**
       * @param nativeIndexConfiguration Provides information on how a Amazon Q Business index used
       * as a retriever for your Amazon Q Business application is configured.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06b8565ef2b06ff3208c6b11af281cccbcfc9b0c6545303b891b9c756cbaa888")
      public
          fun nativeIndexConfiguration(nativeIndexConfiguration: NativeIndexConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.qbusiness.CfnRetriever.RetrieverConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.qbusiness.CfnRetriever.RetrieverConfigurationProperty.builder()

      /**
       * @param kendraIndexConfiguration Provides information on how the Amazon Kendra index used as
       * a retriever for your Amazon Q Business application is configured.
       */
      override fun kendraIndexConfiguration(kendraIndexConfiguration: IResolvable) {
        cdkBuilder.kendraIndexConfiguration(kendraIndexConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param kendraIndexConfiguration Provides information on how the Amazon Kendra index used as
       * a retriever for your Amazon Q Business application is configured.
       */
      override
          fun kendraIndexConfiguration(kendraIndexConfiguration: KendraIndexConfigurationProperty) {
        cdkBuilder.kendraIndexConfiguration(kendraIndexConfiguration.let(KendraIndexConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param kendraIndexConfiguration Provides information on how the Amazon Kendra index used as
       * a retriever for your Amazon Q Business application is configured.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dcde63325e6dbb891a0529453793391f1987522b65304fd152bf13fcd6f65f6e")
      override
          fun kendraIndexConfiguration(kendraIndexConfiguration: KendraIndexConfigurationProperty.Builder.() -> Unit):
          Unit =
          kendraIndexConfiguration(KendraIndexConfigurationProperty(kendraIndexConfiguration))

      /**
       * @param nativeIndexConfiguration Provides information on how a Amazon Q Business index used
       * as a retriever for your Amazon Q Business application is configured.
       */
      override fun nativeIndexConfiguration(nativeIndexConfiguration: IResolvable) {
        cdkBuilder.nativeIndexConfiguration(nativeIndexConfiguration.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param nativeIndexConfiguration Provides information on how a Amazon Q Business index used
       * as a retriever for your Amazon Q Business application is configured.
       */
      override
          fun nativeIndexConfiguration(nativeIndexConfiguration: NativeIndexConfigurationProperty) {
        cdkBuilder.nativeIndexConfiguration(nativeIndexConfiguration.let(NativeIndexConfigurationProperty.Companion::unwrap))
      }

      /**
       * @param nativeIndexConfiguration Provides information on how a Amazon Q Business index used
       * as a retriever for your Amazon Q Business application is configured.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("06b8565ef2b06ff3208c6b11af281cccbcfc9b0c6545303b891b9c756cbaa888")
      override
          fun nativeIndexConfiguration(nativeIndexConfiguration: NativeIndexConfigurationProperty.Builder.() -> Unit):
          Unit =
          nativeIndexConfiguration(NativeIndexConfigurationProperty(nativeIndexConfiguration))

      public fun build():
          software.amazon.awscdk.services.qbusiness.CfnRetriever.RetrieverConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.qbusiness.CfnRetriever.RetrieverConfigurationProperty,
    ) : CdkObject(cdkObject),
        RetrieverConfigurationProperty {
      /**
       * Provides information on how the Amazon Kendra index used as a retriever for your Amazon Q
       * Business application is configured.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-retriever-retrieverconfiguration.html#cfn-qbusiness-retriever-retrieverconfiguration-kendraindexconfiguration)
       */
      override fun kendraIndexConfiguration(): Any? = unwrap(this).getKendraIndexConfiguration()

      /**
       * Provides information on how a Amazon Q Business index used as a retriever for your Amazon Q
       * Business application is configured.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-qbusiness-retriever-retrieverconfiguration.html#cfn-qbusiness-retriever-retrieverconfiguration-nativeindexconfiguration)
       */
      override fun nativeIndexConfiguration(): Any? = unwrap(this).getNativeIndexConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RetrieverConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.qbusiness.CfnRetriever.RetrieverConfigurationProperty):
          RetrieverConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RetrieverConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RetrieverConfigurationProperty):
          software.amazon.awscdk.services.qbusiness.CfnRetriever.RetrieverConfigurationProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.qbusiness.CfnRetriever.RetrieverConfigurationProperty
    }
  }
}
