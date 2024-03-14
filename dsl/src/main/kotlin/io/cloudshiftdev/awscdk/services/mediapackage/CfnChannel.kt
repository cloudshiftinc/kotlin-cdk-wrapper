package io.cloudshiftdev.awscdk.services.mediapackage

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnChannel internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediapackage.CfnChannel,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The channel's unique system-generated resource name, based on the AWS record.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Any descriptive information that you want to add to the channel for future identification
   * purposes.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * Any descriptive information that you want to add to the channel for future identification
   * purposes.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Configures egress access logs.
   */
  public open fun egressAccessLogs(): Any? = unwrap(this).getEgressAccessLogs()

  /**
   * Configures egress access logs.
   */
  public open fun egressAccessLogs(`value`: IResolvable) {
    unwrap(this).setEgressAccessLogs(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configures egress access logs.
   */
  public open fun egressAccessLogs(`value`: LogConfigurationProperty) {
    unwrap(this).setEgressAccessLogs(`value`.let(LogConfigurationProperty::unwrap))
  }

  /**
   * Configures egress access logs.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("896c2c8f0f915a4ef95780c75bfc92db9a4ae391aa063dd24e1d93e66e6bcc10")
  public open fun egressAccessLogs(`value`: LogConfigurationProperty.Builder.() -> Unit): Unit =
      egressAccessLogs(LogConfigurationProperty(`value`))

  /**
   * The input URL where the source stream should be sent.
   */
  public open fun hlsIngest(): Any? = unwrap(this).getHlsIngest()

  /**
   * The input URL where the source stream should be sent.
   */
  public open fun hlsIngest(`value`: IResolvable) {
    unwrap(this).setHlsIngest(`value`.let(IResolvable::unwrap))
  }

  /**
   * The input URL where the source stream should be sent.
   */
  public open fun hlsIngest(`value`: HlsIngestProperty) {
    unwrap(this).setHlsIngest(`value`.let(HlsIngestProperty::unwrap))
  }

  /**
   * The input URL where the source stream should be sent.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a1f40df248ceb5b3ee0c429330e28bced8d4e450636d9a942e60d83755f65381")
  public open fun hlsIngest(`value`: HlsIngestProperty.Builder.() -> Unit): Unit =
      hlsIngest(HlsIngestProperty(`value`))

  /**
   * Unique identifier that you assign to the channel.
   */
  public open fun id(): String = unwrap(this).getId()

  /**
   * Unique identifier that you assign to the channel.
   */
  public open fun id(`value`: String) {
    unwrap(this).setId(`value`)
  }

  /**
   * Configures ingress access logs.
   */
  public open fun ingressAccessLogs(): Any? = unwrap(this).getIngressAccessLogs()

  /**
   * Configures ingress access logs.
   */
  public open fun ingressAccessLogs(`value`: IResolvable) {
    unwrap(this).setIngressAccessLogs(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configures ingress access logs.
   */
  public open fun ingressAccessLogs(`value`: LogConfigurationProperty) {
    unwrap(this).setIngressAccessLogs(`value`.let(LogConfigurationProperty::unwrap))
  }

  /**
   * Configures ingress access logs.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e7e808a86fd328e4349b6639d1391d6c712402dcae23723d44c262fa677a8fea")
  public open fun ingressAccessLogs(`value`: LogConfigurationProperty.Builder.() -> Unit): Unit =
      ingressAccessLogs(LogConfigurationProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to assign to the channel.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The tags to assign to the channel.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * The tags to assign to the channel.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.mediapackage.CfnChannel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Any descriptive information that you want to add to the channel for future identification
     * purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-description)
     * @param description Any descriptive information that you want to add to the channel for future
     * identification purposes. 
     */
    public fun description(description: String)

    /**
     * Configures egress access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-egressaccesslogs)
     * @param egressAccessLogs Configures egress access logs. 
     */
    public fun egressAccessLogs(egressAccessLogs: IResolvable)

    /**
     * Configures egress access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-egressaccesslogs)
     * @param egressAccessLogs Configures egress access logs. 
     */
    public fun egressAccessLogs(egressAccessLogs: LogConfigurationProperty)

    /**
     * Configures egress access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-egressaccesslogs)
     * @param egressAccessLogs Configures egress access logs. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9bc4e83f696f474d194475eef3cdd052f78dac16858f80a86e40597b5f6dee93")
    public fun egressAccessLogs(egressAccessLogs: LogConfigurationProperty.Builder.() -> Unit)

    /**
     * The input URL where the source stream should be sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-hlsingest)
     * @param hlsIngest The input URL where the source stream should be sent. 
     */
    public fun hlsIngest(hlsIngest: IResolvable)

    /**
     * The input URL where the source stream should be sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-hlsingest)
     * @param hlsIngest The input URL where the source stream should be sent. 
     */
    public fun hlsIngest(hlsIngest: HlsIngestProperty)

    /**
     * The input URL where the source stream should be sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-hlsingest)
     * @param hlsIngest The input URL where the source stream should be sent. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce45ba853ca8be3bd9aaafb4a65d0f49b8ab1a9bcd8a3458828730810b0a45ad")
    public fun hlsIngest(hlsIngest: HlsIngestProperty.Builder.() -> Unit)

    /**
     * Unique identifier that you assign to the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-id)
     * @param id Unique identifier that you assign to the channel. 
     */
    public fun id(id: String)

    /**
     * Configures ingress access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-ingressaccesslogs)
     * @param ingressAccessLogs Configures ingress access logs. 
     */
    public fun ingressAccessLogs(ingressAccessLogs: IResolvable)

    /**
     * Configures ingress access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-ingressaccesslogs)
     * @param ingressAccessLogs Configures ingress access logs. 
     */
    public fun ingressAccessLogs(ingressAccessLogs: LogConfigurationProperty)

    /**
     * Configures ingress access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-ingressaccesslogs)
     * @param ingressAccessLogs Configures ingress access logs. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1cc6a4df1a4648db43d3aff87ead5bb75c6d116955a455cb6f77090b6136e8b")
    public fun ingressAccessLogs(ingressAccessLogs: LogConfigurationProperty.Builder.() -> Unit)

    /**
     * The tags to assign to the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-tags)
     * @param tags The tags to assign to the channel. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags to assign to the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-tags)
     * @param tags The tags to assign to the channel. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediapackage.CfnChannel.Builder =
        software.amazon.awscdk.services.mediapackage.CfnChannel.Builder.create(scope, id)

    /**
     * Any descriptive information that you want to add to the channel for future identification
     * purposes.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-description)
     * @param description Any descriptive information that you want to add to the channel for future
     * identification purposes. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Configures egress access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-egressaccesslogs)
     * @param egressAccessLogs Configures egress access logs. 
     */
    override fun egressAccessLogs(egressAccessLogs: IResolvable) {
      cdkBuilder.egressAccessLogs(egressAccessLogs.let(IResolvable::unwrap))
    }

    /**
     * Configures egress access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-egressaccesslogs)
     * @param egressAccessLogs Configures egress access logs. 
     */
    override fun egressAccessLogs(egressAccessLogs: LogConfigurationProperty) {
      cdkBuilder.egressAccessLogs(egressAccessLogs.let(LogConfigurationProperty::unwrap))
    }

    /**
     * Configures egress access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-egressaccesslogs)
     * @param egressAccessLogs Configures egress access logs. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9bc4e83f696f474d194475eef3cdd052f78dac16858f80a86e40597b5f6dee93")
    override fun egressAccessLogs(egressAccessLogs: LogConfigurationProperty.Builder.() -> Unit):
        Unit = egressAccessLogs(LogConfigurationProperty(egressAccessLogs))

    /**
     * The input URL where the source stream should be sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-hlsingest)
     * @param hlsIngest The input URL where the source stream should be sent. 
     */
    override fun hlsIngest(hlsIngest: IResolvable) {
      cdkBuilder.hlsIngest(hlsIngest.let(IResolvable::unwrap))
    }

    /**
     * The input URL where the source stream should be sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-hlsingest)
     * @param hlsIngest The input URL where the source stream should be sent. 
     */
    override fun hlsIngest(hlsIngest: HlsIngestProperty) {
      cdkBuilder.hlsIngest(hlsIngest.let(HlsIngestProperty::unwrap))
    }

    /**
     * The input URL where the source stream should be sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-hlsingest)
     * @param hlsIngest The input URL where the source stream should be sent. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ce45ba853ca8be3bd9aaafb4a65d0f49b8ab1a9bcd8a3458828730810b0a45ad")
    override fun hlsIngest(hlsIngest: HlsIngestProperty.Builder.() -> Unit): Unit =
        hlsIngest(HlsIngestProperty(hlsIngest))

    /**
     * Unique identifier that you assign to the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-id)
     * @param id Unique identifier that you assign to the channel. 
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * Configures ingress access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-ingressaccesslogs)
     * @param ingressAccessLogs Configures ingress access logs. 
     */
    override fun ingressAccessLogs(ingressAccessLogs: IResolvable) {
      cdkBuilder.ingressAccessLogs(ingressAccessLogs.let(IResolvable::unwrap))
    }

    /**
     * Configures ingress access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-ingressaccesslogs)
     * @param ingressAccessLogs Configures ingress access logs. 
     */
    override fun ingressAccessLogs(ingressAccessLogs: LogConfigurationProperty) {
      cdkBuilder.ingressAccessLogs(ingressAccessLogs.let(LogConfigurationProperty::unwrap))
    }

    /**
     * Configures ingress access logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-ingressaccesslogs)
     * @param ingressAccessLogs Configures ingress access logs. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a1cc6a4df1a4648db43d3aff87ead5bb75c6d116955a455cb6f77090b6136e8b")
    override fun ingressAccessLogs(ingressAccessLogs: LogConfigurationProperty.Builder.() -> Unit):
        Unit = ingressAccessLogs(LogConfigurationProperty(ingressAccessLogs))

    /**
     * The tags to assign to the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-tags)
     * @param tags The tags to assign to the channel. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The tags to assign to the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediapackage-channel.html#cfn-mediapackage-channel-tags)
     * @param tags The tags to assign to the channel. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.mediapackage.CfnChannel = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnChannel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnChannel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnChannel):
        CfnChannel = CfnChannel(cdkObject)

    internal fun unwrap(wrapped: CfnChannel):
        software.amazon.awscdk.services.mediapackage.CfnChannel = wrapped.cdkObject
  }

  public interface IngestEndpointProperty {
    /**
     * The endpoint identifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-channel-ingestendpoint.html#cfn-mediapackage-channel-ingestendpoint-id)
     */
    public fun id(): String

    /**
     * The system-generated password for WebDAV input authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-channel-ingestendpoint.html#cfn-mediapackage-channel-ingestendpoint-password)
     */
    public fun password(): String

    /**
     * The input URL where the source stream should be sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-channel-ingestendpoint.html#cfn-mediapackage-channel-ingestendpoint-url)
     */
    public fun url(): String

    /**
     * The system-generated username for WebDAV input authentication.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-channel-ingestendpoint.html#cfn-mediapackage-channel-ingestendpoint-username)
     */
    public fun username(): String

    /**
     * A builder for [IngestEndpointProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The endpoint identifier. 
       */
      public fun id(id: String)

      /**
       * @param password The system-generated password for WebDAV input authentication. 
       */
      public fun password(password: String)

      /**
       * @param url The input URL where the source stream should be sent. 
       */
      public fun url(url: String)

      /**
       * @param username The system-generated username for WebDAV input authentication. 
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnChannel.IngestEndpointProperty.Builder =
          software.amazon.awscdk.services.mediapackage.CfnChannel.IngestEndpointProperty.builder()

      /**
       * @param id The endpoint identifier. 
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param password The system-generated password for WebDAV input authentication. 
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param url The input URL where the source stream should be sent. 
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      /**
       * @param username The system-generated username for WebDAV input authentication. 
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnChannel.IngestEndpointProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnChannel.IngestEndpointProperty,
    ) : IngestEndpointProperty {
      /**
       * The endpoint identifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-channel-ingestendpoint.html#cfn-mediapackage-channel-ingestendpoint-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The system-generated password for WebDAV input authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-channel-ingestendpoint.html#cfn-mediapackage-channel-ingestendpoint-password)
       */
      override fun password(): String = unwrap(this).getPassword()

      /**
       * The input URL where the source stream should be sent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-channel-ingestendpoint.html#cfn-mediapackage-channel-ingestendpoint-url)
       */
      override fun url(): String = unwrap(this).getUrl()

      /**
       * The system-generated username for WebDAV input authentication.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-channel-ingestendpoint.html#cfn-mediapackage-channel-ingestendpoint-username)
       */
      override fun username(): String = unwrap(this).getUsername()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IngestEndpointProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnChannel.IngestEndpointProperty):
          IngestEndpointProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngestEndpointProperty):
          software.amazon.awscdk.services.mediapackage.CfnChannel.IngestEndpointProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface HlsIngestProperty {
    /**
     * The input URL where the source stream should be sent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-channel-hlsingest.html#cfn-mediapackage-channel-hlsingest-ingestendpoints)
     */
    public fun ingestEndpoints(): Any? = unwrap(this).getIngestEndpoints()

    /**
     * A builder for [HlsIngestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ingestEndpoints The input URL where the source stream should be sent.
       */
      public fun ingestEndpoints(ingestEndpoints: IResolvable)

      /**
       * @param ingestEndpoints The input URL where the source stream should be sent.
       */
      public fun ingestEndpoints(ingestEndpoints: List<Any>)

      /**
       * @param ingestEndpoints The input URL where the source stream should be sent.
       */
      public fun ingestEndpoints(vararg ingestEndpoints: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnChannel.HlsIngestProperty.Builder =
          software.amazon.awscdk.services.mediapackage.CfnChannel.HlsIngestProperty.builder()

      /**
       * @param ingestEndpoints The input URL where the source stream should be sent.
       */
      override fun ingestEndpoints(ingestEndpoints: IResolvable) {
        cdkBuilder.ingestEndpoints(ingestEndpoints.let(IResolvable::unwrap))
      }

      /**
       * @param ingestEndpoints The input URL where the source stream should be sent.
       */
      override fun ingestEndpoints(ingestEndpoints: List<Any>) {
        cdkBuilder.ingestEndpoints(ingestEndpoints)
      }

      /**
       * @param ingestEndpoints The input URL where the source stream should be sent.
       */
      override fun ingestEndpoints(vararg ingestEndpoints: Any): Unit =
          ingestEndpoints(ingestEndpoints.toList())

      public fun build(): software.amazon.awscdk.services.mediapackage.CfnChannel.HlsIngestProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnChannel.HlsIngestProperty,
    ) : HlsIngestProperty {
      /**
       * The input URL where the source stream should be sent.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-channel-hlsingest.html#cfn-mediapackage-channel-hlsingest-ingestendpoints)
       */
      override fun ingestEndpoints(): Any? = unwrap(this).getIngestEndpoints()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HlsIngestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnChannel.HlsIngestProperty):
          HlsIngestProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HlsIngestProperty):
          software.amazon.awscdk.services.mediapackage.CfnChannel.HlsIngestProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LogConfigurationProperty {
    /**
     * Sets a custom Amazon CloudWatch log group name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-channel-logconfiguration.html#cfn-mediapackage-channel-logconfiguration-loggroupname)
     */
    public fun logGroupName(): String? = unwrap(this).getLogGroupName()

    /**
     * A builder for [LogConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param logGroupName Sets a custom Amazon CloudWatch log group name.
       */
      public fun logGroupName(logGroupName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.mediapackage.CfnChannel.LogConfigurationProperty.Builder =
          software.amazon.awscdk.services.mediapackage.CfnChannel.LogConfigurationProperty.builder()

      /**
       * @param logGroupName Sets a custom Amazon CloudWatch log group name.
       */
      override fun logGroupName(logGroupName: String) {
        cdkBuilder.logGroupName(logGroupName)
      }

      public fun build():
          software.amazon.awscdk.services.mediapackage.CfnChannel.LogConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.mediapackage.CfnChannel.LogConfigurationProperty,
    ) : LogConfigurationProperty {
      /**
       * Sets a custom Amazon CloudWatch log group name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediapackage-channel-logconfiguration.html#cfn-mediapackage-channel-logconfiguration-loggroupname)
       */
      override fun logGroupName(): String? = unwrap(this).getLogGroupName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LogConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.mediapackage.CfnChannel.LogConfigurationProperty):
          LogConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LogConfigurationProperty):
          software.amazon.awscdk.services.mediapackage.CfnChannel.LogConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
