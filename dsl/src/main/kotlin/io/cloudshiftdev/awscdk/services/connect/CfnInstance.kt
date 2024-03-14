package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnInstance internal constructor(
  private val cdkObject: software.amazon.awscdk.services.connect.CfnInstance,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The Amazon Resource Name (ARN) of the instance.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * When the instance was created.
   */
  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  /**
   * The identifier of the Amazon Connect instance.
   *
   * You can find the instanceId in the ARN of the instance.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The state of the instance.
   */
  public open fun attrInstanceStatus(): String = unwrap(this).getAttrInstanceStatus()

  /**
   * The service role of the instance.
   */
  public open fun attrServiceRole(): String = unwrap(this).getAttrServiceRole()

  /**
   * A toggle for an individual feature at the instance level.
   */
  public open fun attributes(): Any = unwrap(this).getAttributes()

  /**
   * A toggle for an individual feature at the instance level.
   */
  public open fun attributes(`value`: IResolvable) {
    unwrap(this).setAttributes(`value`.let(IResolvable::unwrap))
  }

  /**
   * A toggle for an individual feature at the instance level.
   */
  public open fun attributes(`value`: AttributesProperty) {
    unwrap(this).setAttributes(`value`.let(AttributesProperty::unwrap))
  }

  /**
   * A toggle for an individual feature at the instance level.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("4a5ec54cfdae16c873c4f812b85e8ece8888e2eeab8bd17d1be1ca9a33563feb")
  public open fun attributes(`value`: AttributesProperty.Builder.() -> Unit): Unit =
      attributes(AttributesProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The identifier for the directory.
   */
  public open fun directoryId(): String? = unwrap(this).getDirectoryId()

  /**
   * The identifier for the directory.
   */
  public open fun directoryId(`value`: String) {
    unwrap(this).setDirectoryId(`value`)
  }

  /**
   * The identity management type.
   */
  public open fun identityManagementType(): String = unwrap(this).getIdentityManagementType()

  /**
   * The identity management type.
   */
  public open fun identityManagementType(`value`: String) {
    unwrap(this).setIdentityManagementType(`value`)
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
   * The alias of instance.
   */
  public open fun instanceAlias(): String? = unwrap(this).getInstanceAlias()

  /**
   * The alias of instance.
   */
  public open fun instanceAlias(`value`: String) {
    unwrap(this).setInstanceAlias(`value`)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.connect.CfnInstance].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A toggle for an individual feature at the instance level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-attributes)
     * @param attributes A toggle for an individual feature at the instance level. 
     */
    public fun attributes(attributes: IResolvable)

    /**
     * A toggle for an individual feature at the instance level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-attributes)
     * @param attributes A toggle for an individual feature at the instance level. 
     */
    public fun attributes(attributes: AttributesProperty)

    /**
     * A toggle for an individual feature at the instance level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-attributes)
     * @param attributes A toggle for an individual feature at the instance level. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("400110a7d8d59f03f56537f5d326d22abaeb5d6e402b20b389ae4815102f63c6")
    public fun attributes(attributes: AttributesProperty.Builder.() -> Unit)

    /**
     * The identifier for the directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-directoryid)
     * @param directoryId The identifier for the directory. 
     */
    public fun directoryId(directoryId: String)

    /**
     * The identity management type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-identitymanagementtype)
     * @param identityManagementType The identity management type. 
     */
    public fun identityManagementType(identityManagementType: String)

    /**
     * The alias of instance.
     *
     * `InstanceAlias` is only required when `IdentityManagementType` is `CONNECT_MANAGED` or `SAML`
     * . `InstanceAlias` is not required when `IdentityManagementType` is `EXISTING_DIRECTORY` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-instancealias)
     * @param instanceAlias The alias of instance. 
     */
    public fun instanceAlias(instanceAlias: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnInstance.Builder =
        software.amazon.awscdk.services.connect.CfnInstance.Builder.create(scope, id)

    /**
     * A toggle for an individual feature at the instance level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-attributes)
     * @param attributes A toggle for an individual feature at the instance level. 
     */
    override fun attributes(attributes: IResolvable) {
      cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
    }

    /**
     * A toggle for an individual feature at the instance level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-attributes)
     * @param attributes A toggle for an individual feature at the instance level. 
     */
    override fun attributes(attributes: AttributesProperty) {
      cdkBuilder.attributes(attributes.let(AttributesProperty::unwrap))
    }

    /**
     * A toggle for an individual feature at the instance level.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-attributes)
     * @param attributes A toggle for an individual feature at the instance level. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("400110a7d8d59f03f56537f5d326d22abaeb5d6e402b20b389ae4815102f63c6")
    override fun attributes(attributes: AttributesProperty.Builder.() -> Unit): Unit =
        attributes(AttributesProperty(attributes))

    /**
     * The identifier for the directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-directoryid)
     * @param directoryId The identifier for the directory. 
     */
    override fun directoryId(directoryId: String) {
      cdkBuilder.directoryId(directoryId)
    }

    /**
     * The identity management type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-identitymanagementtype)
     * @param identityManagementType The identity management type. 
     */
    override fun identityManagementType(identityManagementType: String) {
      cdkBuilder.identityManagementType(identityManagementType)
    }

    /**
     * The alias of instance.
     *
     * `InstanceAlias` is only required when `IdentityManagementType` is `CONNECT_MANAGED` or `SAML`
     * . `InstanceAlias` is not required when `IdentityManagementType` is `EXISTING_DIRECTORY` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-instancealias)
     * @param instanceAlias The alias of instance. 
     */
    override fun instanceAlias(instanceAlias: String) {
      cdkBuilder.instanceAlias(instanceAlias)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-connect-instance.html#cfn-connect-instance-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connect.CfnInstance = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInstance {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInstance(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnInstance): CfnInstance =
        CfnInstance(cdkObject)

    internal fun unwrap(wrapped: CfnInstance): software.amazon.awscdk.services.connect.CfnInstance =
        wrapped.cdkObject
  }

  public interface AttributesProperty {
    /**
     * Boolean flag which enables AUTO_RESOLVE_BEST_VOICES on an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instance-attributes.html#cfn-connect-instance-attributes-autoresolvebestvoices)
     */
    public fun autoResolveBestVoices(): Any? = unwrap(this).getAutoResolveBestVoices()

    /**
     * Boolean flag which enables CONTACT_LENS on an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instance-attributes.html#cfn-connect-instance-attributes-contactlens)
     */
    public fun contactLens(): Any? = unwrap(this).getContactLens()

    /**
     * Boolean flag which enables CONTACTFLOW_LOGS on an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instance-attributes.html#cfn-connect-instance-attributes-contactflowlogs)
     */
    public fun contactflowLogs(): Any? = unwrap(this).getContactflowLogs()

    /**
     * Boolean flag which enables EARLY_MEDIA on an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instance-attributes.html#cfn-connect-instance-attributes-earlymedia)
     */
    public fun earlyMedia(): Any? = unwrap(this).getEarlyMedia()

    /**
     * Mandatory element which enables inbound calls on new instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instance-attributes.html#cfn-connect-instance-attributes-inboundcalls)
     */
    public fun inboundCalls(): Any

    /**
     * Mandatory element which enables outbound calls on new instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instance-attributes.html#cfn-connect-instance-attributes-outboundcalls)
     */
    public fun outboundCalls(): Any

    /**
     * Boolean flag which enables USE_CUSTOM_TTS_VOICES on an instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instance-attributes.html#cfn-connect-instance-attributes-usecustomttsvoices)
     */
    public fun useCustomTtsVoices(): Any? = unwrap(this).getUseCustomTtsVoices()

    /**
     * A builder for [AttributesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoResolveBestVoices Boolean flag which enables AUTO_RESOLVE_BEST_VOICES on an
       * instance.
       */
      public fun autoResolveBestVoices(autoResolveBestVoices: Boolean)

      /**
       * @param autoResolveBestVoices Boolean flag which enables AUTO_RESOLVE_BEST_VOICES on an
       * instance.
       */
      public fun autoResolveBestVoices(autoResolveBestVoices: IResolvable)

      /**
       * @param contactLens Boolean flag which enables CONTACT_LENS on an instance.
       */
      public fun contactLens(contactLens: Boolean)

      /**
       * @param contactLens Boolean flag which enables CONTACT_LENS on an instance.
       */
      public fun contactLens(contactLens: IResolvable)

      /**
       * @param contactflowLogs Boolean flag which enables CONTACTFLOW_LOGS on an instance.
       */
      public fun contactflowLogs(contactflowLogs: Boolean)

      /**
       * @param contactflowLogs Boolean flag which enables CONTACTFLOW_LOGS on an instance.
       */
      public fun contactflowLogs(contactflowLogs: IResolvable)

      /**
       * @param earlyMedia Boolean flag which enables EARLY_MEDIA on an instance.
       */
      public fun earlyMedia(earlyMedia: Boolean)

      /**
       * @param earlyMedia Boolean flag which enables EARLY_MEDIA on an instance.
       */
      public fun earlyMedia(earlyMedia: IResolvable)

      /**
       * @param inboundCalls Mandatory element which enables inbound calls on new instance. 
       */
      public fun inboundCalls(inboundCalls: Boolean)

      /**
       * @param inboundCalls Mandatory element which enables inbound calls on new instance. 
       */
      public fun inboundCalls(inboundCalls: IResolvable)

      /**
       * @param outboundCalls Mandatory element which enables outbound calls on new instance. 
       */
      public fun outboundCalls(outboundCalls: Boolean)

      /**
       * @param outboundCalls Mandatory element which enables outbound calls on new instance. 
       */
      public fun outboundCalls(outboundCalls: IResolvable)

      /**
       * @param useCustomTtsVoices Boolean flag which enables USE_CUSTOM_TTS_VOICES on an instance.
       */
      public fun useCustomTtsVoices(useCustomTtsVoices: Boolean)

      /**
       * @param useCustomTtsVoices Boolean flag which enables USE_CUSTOM_TTS_VOICES on an instance.
       */
      public fun useCustomTtsVoices(useCustomTtsVoices: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.connect.CfnInstance.AttributesProperty.Builder =
          software.amazon.awscdk.services.connect.CfnInstance.AttributesProperty.builder()

      /**
       * @param autoResolveBestVoices Boolean flag which enables AUTO_RESOLVE_BEST_VOICES on an
       * instance.
       */
      override fun autoResolveBestVoices(autoResolveBestVoices: Boolean) {
        cdkBuilder.autoResolveBestVoices(autoResolveBestVoices)
      }

      /**
       * @param autoResolveBestVoices Boolean flag which enables AUTO_RESOLVE_BEST_VOICES on an
       * instance.
       */
      override fun autoResolveBestVoices(autoResolveBestVoices: IResolvable) {
        cdkBuilder.autoResolveBestVoices(autoResolveBestVoices.let(IResolvable::unwrap))
      }

      /**
       * @param contactLens Boolean flag which enables CONTACT_LENS on an instance.
       */
      override fun contactLens(contactLens: Boolean) {
        cdkBuilder.contactLens(contactLens)
      }

      /**
       * @param contactLens Boolean flag which enables CONTACT_LENS on an instance.
       */
      override fun contactLens(contactLens: IResolvable) {
        cdkBuilder.contactLens(contactLens.let(IResolvable::unwrap))
      }

      /**
       * @param contactflowLogs Boolean flag which enables CONTACTFLOW_LOGS on an instance.
       */
      override fun contactflowLogs(contactflowLogs: Boolean) {
        cdkBuilder.contactflowLogs(contactflowLogs)
      }

      /**
       * @param contactflowLogs Boolean flag which enables CONTACTFLOW_LOGS on an instance.
       */
      override fun contactflowLogs(contactflowLogs: IResolvable) {
        cdkBuilder.contactflowLogs(contactflowLogs.let(IResolvable::unwrap))
      }

      /**
       * @param earlyMedia Boolean flag which enables EARLY_MEDIA on an instance.
       */
      override fun earlyMedia(earlyMedia: Boolean) {
        cdkBuilder.earlyMedia(earlyMedia)
      }

      /**
       * @param earlyMedia Boolean flag which enables EARLY_MEDIA on an instance.
       */
      override fun earlyMedia(earlyMedia: IResolvable) {
        cdkBuilder.earlyMedia(earlyMedia.let(IResolvable::unwrap))
      }

      /**
       * @param inboundCalls Mandatory element which enables inbound calls on new instance. 
       */
      override fun inboundCalls(inboundCalls: Boolean) {
        cdkBuilder.inboundCalls(inboundCalls)
      }

      /**
       * @param inboundCalls Mandatory element which enables inbound calls on new instance. 
       */
      override fun inboundCalls(inboundCalls: IResolvable) {
        cdkBuilder.inboundCalls(inboundCalls.let(IResolvable::unwrap))
      }

      /**
       * @param outboundCalls Mandatory element which enables outbound calls on new instance. 
       */
      override fun outboundCalls(outboundCalls: Boolean) {
        cdkBuilder.outboundCalls(outboundCalls)
      }

      /**
       * @param outboundCalls Mandatory element which enables outbound calls on new instance. 
       */
      override fun outboundCalls(outboundCalls: IResolvable) {
        cdkBuilder.outboundCalls(outboundCalls.let(IResolvable::unwrap))
      }

      /**
       * @param useCustomTtsVoices Boolean flag which enables USE_CUSTOM_TTS_VOICES on an instance.
       */
      override fun useCustomTtsVoices(useCustomTtsVoices: Boolean) {
        cdkBuilder.useCustomTtsVoices(useCustomTtsVoices)
      }

      /**
       * @param useCustomTtsVoices Boolean flag which enables USE_CUSTOM_TTS_VOICES on an instance.
       */
      override fun useCustomTtsVoices(useCustomTtsVoices: IResolvable) {
        cdkBuilder.useCustomTtsVoices(useCustomTtsVoices.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.connect.CfnInstance.AttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.connect.CfnInstance.AttributesProperty,
    ) : AttributesProperty {
      /**
       * Boolean flag which enables AUTO_RESOLVE_BEST_VOICES on an instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instance-attributes.html#cfn-connect-instance-attributes-autoresolvebestvoices)
       */
      override fun autoResolveBestVoices(): Any? = unwrap(this).getAutoResolveBestVoices()

      /**
       * Boolean flag which enables CONTACT_LENS on an instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instance-attributes.html#cfn-connect-instance-attributes-contactlens)
       */
      override fun contactLens(): Any? = unwrap(this).getContactLens()

      /**
       * Boolean flag which enables CONTACTFLOW_LOGS on an instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instance-attributes.html#cfn-connect-instance-attributes-contactflowlogs)
       */
      override fun contactflowLogs(): Any? = unwrap(this).getContactflowLogs()

      /**
       * Boolean flag which enables EARLY_MEDIA on an instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instance-attributes.html#cfn-connect-instance-attributes-earlymedia)
       */
      override fun earlyMedia(): Any? = unwrap(this).getEarlyMedia()

      /**
       * Mandatory element which enables inbound calls on new instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instance-attributes.html#cfn-connect-instance-attributes-inboundcalls)
       */
      override fun inboundCalls(): Any = unwrap(this).getInboundCalls()

      /**
       * Mandatory element which enables outbound calls on new instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instance-attributes.html#cfn-connect-instance-attributes-outboundcalls)
       */
      override fun outboundCalls(): Any = unwrap(this).getOutboundCalls()

      /**
       * Boolean flag which enables USE_CUSTOM_TTS_VOICES on an instance.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-connect-instance-attributes.html#cfn-connect-instance-attributes-usecustomttsvoices)
       */
      override fun useCustomTtsVoices(): Any? = unwrap(this).getUseCustomTtsVoices()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnInstance.AttributesProperty):
          AttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributesProperty):
          software.amazon.awscdk.services.connect.CfnInstance.AttributesProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
