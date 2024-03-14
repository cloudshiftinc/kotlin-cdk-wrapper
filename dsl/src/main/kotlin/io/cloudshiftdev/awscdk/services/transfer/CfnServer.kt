package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnServer internal constructor(
  private val cdkObject: software.amazon.awscdk.services.transfer.CfnServer,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrServerId(): String = unwrap(this).getAttrServerId()

  public open fun certificate(): String? = unwrap(this).getCertificate()

  public open fun certificate(`value`: String) {
    unwrap(this).setCertificate(`value`)
  }

  public open fun domain(): String? = unwrap(this).getDomain()

  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
  }

  public open fun endpointDetails(): Any? = unwrap(this).getEndpointDetails()

  public open fun endpointDetails(`value`: IResolvable) {
    unwrap(this).setEndpointDetails(`value`.let(IResolvable::unwrap))
  }

  public open fun endpointDetails(`value`: EndpointDetailsProperty) {
    unwrap(this).setEndpointDetails(`value`.let(EndpointDetailsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9248c1e476b7aa73977f8fa65f42edbe0686363da48ae7407f52925dc9724ade")
  public open fun endpointDetails(`value`: EndpointDetailsProperty.Builder.() -> Unit): Unit =
      endpointDetails(EndpointDetailsProperty(`value`))

  public open fun endpointType(): String? = unwrap(this).getEndpointType()

  public open fun endpointType(`value`: String) {
    unwrap(this).setEndpointType(`value`)
  }

  public open fun identityProviderDetails(): Any? = unwrap(this).getIdentityProviderDetails()

  public open fun identityProviderDetails(`value`: IResolvable) {
    unwrap(this).setIdentityProviderDetails(`value`.let(IResolvable::unwrap))
  }

  public open fun identityProviderDetails(`value`: IdentityProviderDetailsProperty) {
    unwrap(this).setIdentityProviderDetails(`value`.let(IdentityProviderDetailsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e73d3ec6a0016eb519bdac51e0d36a3d5d1bdfe9fdb8d215ae37d2b92cced963")
  public open
      fun identityProviderDetails(`value`: IdentityProviderDetailsProperty.Builder.() -> Unit): Unit
      = identityProviderDetails(IdentityProviderDetailsProperty(`value`))

  public open fun identityProviderType(): String? = unwrap(this).getIdentityProviderType()

  public open fun identityProviderType(`value`: String) {
    unwrap(this).setIdentityProviderType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun loggingRole(): String? = unwrap(this).getLoggingRole()

  public open fun loggingRole(`value`: String) {
    unwrap(this).setLoggingRole(`value`)
  }

  public open fun postAuthenticationLoginBanner(): String? =
      unwrap(this).getPostAuthenticationLoginBanner()

  public open fun postAuthenticationLoginBanner(`value`: String) {
    unwrap(this).setPostAuthenticationLoginBanner(`value`)
  }

  public open fun preAuthenticationLoginBanner(): String? =
      unwrap(this).getPreAuthenticationLoginBanner()

  public open fun preAuthenticationLoginBanner(`value`: String) {
    unwrap(this).setPreAuthenticationLoginBanner(`value`)
  }

  public open fun protocolDetails(): Any? = unwrap(this).getProtocolDetails()

  public open fun protocolDetails(`value`: IResolvable) {
    unwrap(this).setProtocolDetails(`value`.let(IResolvable::unwrap))
  }

  public open fun protocolDetails(`value`: ProtocolDetailsProperty) {
    unwrap(this).setProtocolDetails(`value`.let(ProtocolDetailsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("03951fca7913f7e63e432ef91c6f77c51fbdaaac60ec58f0590bb8ac6288e316")
  public open fun protocolDetails(`value`: ProtocolDetailsProperty.Builder.() -> Unit): Unit =
      protocolDetails(ProtocolDetailsProperty(`value`))

  public open fun protocols(): List<String> = unwrap(this).getProtocols() ?: emptyList()

  public open fun protocols(`value`: List<String>) {
    unwrap(this).setProtocols(`value`)
  }

  public open fun s3StorageOptions(): Any? = unwrap(this).getS3StorageOptions()

  public open fun s3StorageOptions(`value`: IResolvable) {
    unwrap(this).setS3StorageOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun s3StorageOptions(`value`: S3StorageOptionsProperty) {
    unwrap(this).setS3StorageOptions(`value`.let(S3StorageOptionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("803382341c7075b476f354623c495bcadf2ea00bca87af7ff63b4bd8585fe539")
  public open fun s3StorageOptions(`value`: S3StorageOptionsProperty.Builder.() -> Unit): Unit =
      s3StorageOptions(S3StorageOptionsProperty(`value`))

  public open fun securityPolicyName(): String? = unwrap(this).getSecurityPolicyName()

  public open fun securityPolicyName(`value`: String) {
    unwrap(this).setSecurityPolicyName(`value`)
  }

  public open fun structuredLogDestinations(): List<String> =
      unwrap(this).getStructuredLogDestinations() ?: emptyList()

  public open fun structuredLogDestinations(`value`: List<String>) {
    unwrap(this).setStructuredLogDestinations(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun workflowDetails(): Any? = unwrap(this).getWorkflowDetails()

  public open fun workflowDetails(`value`: IResolvable) {
    unwrap(this).setWorkflowDetails(`value`.let(IResolvable::unwrap))
  }

  public open fun workflowDetails(`value`: WorkflowDetailsProperty) {
    unwrap(this).setWorkflowDetails(`value`.let(WorkflowDetailsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8dbe5ea55055b01f6b208a2a8c15192e828c064b9a093572185f4d6fbebb08d7")
  public open fun workflowDetails(`value`: WorkflowDetailsProperty.Builder.() -> Unit): Unit =
      workflowDetails(WorkflowDetailsProperty(`value`))

  public interface Builder {
    public fun certificate(certificate: String) {
    }

    public fun domain(domain: String) {
    }

    public fun endpointDetails(endpointDetails: IResolvable) {
    }

    public fun endpointDetails(endpointDetails: EndpointDetailsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf0a236db158e33b6465b83db4fee875e78a60764aeaeab4a59b5a8275e50fa2")
    public fun endpointDetails(endpointDetails: EndpointDetailsProperty.Builder.() -> Unit) {
    }

    public fun endpointType(endpointType: String) {
    }

    public fun identityProviderDetails(identityProviderDetails: IResolvable) {
    }

    public fun identityProviderDetails(identityProviderDetails: IdentityProviderDetailsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24ae31b6e5fbf0065d8de2b14590fdff805ca7ab2469499255b6d601154a318e")
    public
        fun identityProviderDetails(identityProviderDetails: IdentityProviderDetailsProperty.Builder.() -> Unit) {
    }

    public fun identityProviderType(identityProviderType: String) {
    }

    public fun loggingRole(loggingRole: String) {
    }

    public fun postAuthenticationLoginBanner(postAuthenticationLoginBanner: String) {
    }

    public fun preAuthenticationLoginBanner(preAuthenticationLoginBanner: String) {
    }

    public fun protocolDetails(protocolDetails: IResolvable) {
    }

    public fun protocolDetails(protocolDetails: ProtocolDetailsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccc7183bb666df2becd469fea8bddfeb4f843e9946ac8688388de90179b8c491")
    public fun protocolDetails(protocolDetails: ProtocolDetailsProperty.Builder.() -> Unit) {
    }

    public fun protocols(protocols: List<String>) {
    }

    public fun s3StorageOptions(s3StorageOptions: IResolvable) {
    }

    public fun s3StorageOptions(s3StorageOptions: S3StorageOptionsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b659ec0eca872ff75383846e223a401c1c1166dc943ca76d7852c3201d038157")
    public fun s3StorageOptions(s3StorageOptions: S3StorageOptionsProperty.Builder.() -> Unit) {
    }

    public fun securityPolicyName(securityPolicyName: String) {
    }

    public fun structuredLogDestinations(structuredLogDestinations: List<String>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun workflowDetails(workflowDetails: IResolvable) {
    }

    public fun workflowDetails(workflowDetails: WorkflowDetailsProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ef374116af82579036ffca50924ac903bbdc16964dff47ec56c8af807f752c7")
    public fun workflowDetails(workflowDetails: WorkflowDetailsProperty.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnServer.Builder =
        software.amazon.awscdk.services.transfer.CfnServer.Builder.create(scope, id)

    public override fun certificate(certificate: String) {
      cdkBuilder.certificate(certificate)
    }

    public override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    public override fun endpointDetails(endpointDetails: IResolvable) {
      cdkBuilder.endpointDetails(endpointDetails.let(IResolvable::unwrap))
    }

    public override fun endpointDetails(endpointDetails: EndpointDetailsProperty) {
      cdkBuilder.endpointDetails(endpointDetails.let(EndpointDetailsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("bf0a236db158e33b6465b83db4fee875e78a60764aeaeab4a59b5a8275e50fa2")
    public override
        fun endpointDetails(endpointDetails: EndpointDetailsProperty.Builder.() -> Unit): Unit =
        endpointDetails(EndpointDetailsProperty(endpointDetails))

    public override fun endpointType(endpointType: String) {
      cdkBuilder.endpointType(endpointType)
    }

    public override fun identityProviderDetails(identityProviderDetails: IResolvable) {
      cdkBuilder.identityProviderDetails(identityProviderDetails.let(IResolvable::unwrap))
    }

    public override
        fun identityProviderDetails(identityProviderDetails: IdentityProviderDetailsProperty) {
      cdkBuilder.identityProviderDetails(identityProviderDetails.let(IdentityProviderDetailsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("24ae31b6e5fbf0065d8de2b14590fdff805ca7ab2469499255b6d601154a318e")
    public override
        fun identityProviderDetails(identityProviderDetails: IdentityProviderDetailsProperty.Builder.() -> Unit):
        Unit = identityProviderDetails(IdentityProviderDetailsProperty(identityProviderDetails))

    public override fun identityProviderType(identityProviderType: String) {
      cdkBuilder.identityProviderType(identityProviderType)
    }

    public override fun loggingRole(loggingRole: String) {
      cdkBuilder.loggingRole(loggingRole)
    }

    public override fun postAuthenticationLoginBanner(postAuthenticationLoginBanner: String) {
      cdkBuilder.postAuthenticationLoginBanner(postAuthenticationLoginBanner)
    }

    public override fun preAuthenticationLoginBanner(preAuthenticationLoginBanner: String) {
      cdkBuilder.preAuthenticationLoginBanner(preAuthenticationLoginBanner)
    }

    public override fun protocolDetails(protocolDetails: IResolvable) {
      cdkBuilder.protocolDetails(protocolDetails.let(IResolvable::unwrap))
    }

    public override fun protocolDetails(protocolDetails: ProtocolDetailsProperty) {
      cdkBuilder.protocolDetails(protocolDetails.let(ProtocolDetailsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccc7183bb666df2becd469fea8bddfeb4f843e9946ac8688388de90179b8c491")
    public override
        fun protocolDetails(protocolDetails: ProtocolDetailsProperty.Builder.() -> Unit): Unit =
        protocolDetails(ProtocolDetailsProperty(protocolDetails))

    public override fun protocols(protocols: List<String>) {
      cdkBuilder.protocols(protocols)
    }

    public override fun s3StorageOptions(s3StorageOptions: IResolvable) {
      cdkBuilder.s3StorageOptions(s3StorageOptions.let(IResolvable::unwrap))
    }

    public override fun s3StorageOptions(s3StorageOptions: S3StorageOptionsProperty) {
      cdkBuilder.s3StorageOptions(s3StorageOptions.let(S3StorageOptionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b659ec0eca872ff75383846e223a401c1c1166dc943ca76d7852c3201d038157")
    public override
        fun s3StorageOptions(s3StorageOptions: S3StorageOptionsProperty.Builder.() -> Unit): Unit =
        s3StorageOptions(S3StorageOptionsProperty(s3StorageOptions))

    public override fun securityPolicyName(securityPolicyName: String) {
      cdkBuilder.securityPolicyName(securityPolicyName)
    }

    public override fun structuredLogDestinations(structuredLogDestinations: List<String>) {
      cdkBuilder.structuredLogDestinations(structuredLogDestinations)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun workflowDetails(workflowDetails: IResolvable) {
      cdkBuilder.workflowDetails(workflowDetails.let(IResolvable::unwrap))
    }

    public override fun workflowDetails(workflowDetails: WorkflowDetailsProperty) {
      cdkBuilder.workflowDetails(workflowDetails.let(WorkflowDetailsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8ef374116af82579036ffca50924ac903bbdc16964dff47ec56c8af807f752c7")
    public override
        fun workflowDetails(workflowDetails: WorkflowDetailsProperty.Builder.() -> Unit): Unit =
        workflowDetails(WorkflowDetailsProperty(workflowDetails))

    public fun build(): software.amazon.awscdk.services.transfer.CfnServer = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnServer {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnServer(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnServer): CfnServer =
        CfnServer(cdkObject)

    internal fun unwrap(wrapped: CfnServer): software.amazon.awscdk.services.transfer.CfnServer =
        wrapped.cdkObject
  }

  public interface ProtocolDetailsProperty {
    public fun as2Transports(): List<String> = unwrap(this).getAs2Transports() ?: emptyList()

    public fun passiveIp(): String? = unwrap(this).getPassiveIp()

    public fun setStatOption(): String? = unwrap(this).getSetStatOption()

    public fun tlsSessionResumptionMode(): String? = unwrap(this).getTlsSessionResumptionMode()

    public interface Builder {
      public fun as2Transports(as2Transports: List<String>) {
      }

      public fun passiveIp(passiveIp: String) {
      }

      public fun statOption(setStatOption: String) {
      }

      public fun tlsSessionResumptionMode(tlsSessionResumptionMode: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnServer.ProtocolDetailsProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnServer.ProtocolDetailsProperty.builder()

      public override fun as2Transports(as2Transports: List<String>) {
        cdkBuilder.as2Transports(as2Transports)
      }

      public override fun passiveIp(passiveIp: String) {
        cdkBuilder.passiveIp(passiveIp)
      }

      public override fun statOption(setStatOption: String) {
        cdkBuilder.setStatOption(setStatOption)
      }

      public override fun tlsSessionResumptionMode(tlsSessionResumptionMode: String) {
        cdkBuilder.tlsSessionResumptionMode(tlsSessionResumptionMode)
      }

      public fun build(): software.amazon.awscdk.services.transfer.CfnServer.ProtocolDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.transfer.CfnServer.ProtocolDetailsProperty,
    ) : ProtocolDetailsProperty {
      public override fun as2Transports(): List<String> = unwrap(this).getAs2Transports() ?:
          emptyList()

      public override fun passiveIp(): String? = unwrap(this).getPassiveIp()

      public override fun setStatOption(): String? = unwrap(this).getSetStatOption()

      public override fun tlsSessionResumptionMode(): String? =
          unwrap(this).getTlsSessionResumptionMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProtocolDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnServer.ProtocolDetailsProperty):
          ProtocolDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProtocolDetailsProperty):
          software.amazon.awscdk.services.transfer.CfnServer.ProtocolDetailsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface WorkflowDetailsProperty {
    public fun onPartialUpload(): Any? = unwrap(this).getOnPartialUpload()

    public fun onUpload(): Any? = unwrap(this).getOnUpload()

    public interface Builder {
      public fun onPartialUpload(onPartialUpload: IResolvable) {
      }

      public fun onPartialUpload(onPartialUpload: List<Any>) {
      }

      public fun onUpload(onUpload: IResolvable) {
      }

      public fun onUpload(onUpload: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailsProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailsProperty.builder()

      public override fun onPartialUpload(onPartialUpload: IResolvable) {
        cdkBuilder.onPartialUpload(onPartialUpload.let(IResolvable::unwrap))
      }

      public override fun onPartialUpload(onPartialUpload: List<Any>) {
        cdkBuilder.onPartialUpload(onPartialUpload)
      }

      public override fun onUpload(onUpload: IResolvable) {
        cdkBuilder.onUpload(onUpload.let(IResolvable::unwrap))
      }

      public override fun onUpload(onUpload: List<Any>) {
        cdkBuilder.onUpload(onUpload)
      }

      public fun build(): software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailsProperty,
    ) : WorkflowDetailsProperty {
      public override fun onPartialUpload(): Any? = unwrap(this).getOnPartialUpload()

      public override fun onUpload(): Any? = unwrap(this).getOnUpload()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WorkflowDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailsProperty):
          WorkflowDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkflowDetailsProperty):
          software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface WorkflowDetailProperty {
    public fun executionRole(): String

    public fun workflowId(): String

    public interface Builder {
      public fun executionRole(executionRole: String) {
      }

      public fun workflowId(workflowId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailProperty.builder()

      public override fun executionRole(executionRole: String) {
        cdkBuilder.executionRole(executionRole)
      }

      public override fun workflowId(workflowId: String) {
        cdkBuilder.workflowId(workflowId)
      }

      public fun build(): software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailProperty,
    ) : WorkflowDetailProperty {
      public override fun executionRole(): String = unwrap(this).getExecutionRole()

      public override fun workflowId(): String = unwrap(this).getWorkflowId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): WorkflowDetailProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailProperty):
          WorkflowDetailProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: WorkflowDetailProperty):
          software.amazon.awscdk.services.transfer.CfnServer.WorkflowDetailProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3StorageOptionsProperty {
    public fun directoryListingOptimization(): String? =
        unwrap(this).getDirectoryListingOptimization()

    public interface Builder {
      public fun directoryListingOptimization(directoryListingOptimization: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnServer.S3StorageOptionsProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnServer.S3StorageOptionsProperty.builder()

      public override fun directoryListingOptimization(directoryListingOptimization: String) {
        cdkBuilder.directoryListingOptimization(directoryListingOptimization)
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnServer.S3StorageOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.transfer.CfnServer.S3StorageOptionsProperty,
    ) : S3StorageOptionsProperty {
      public override fun directoryListingOptimization(): String? =
          unwrap(this).getDirectoryListingOptimization()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3StorageOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnServer.S3StorageOptionsProperty):
          S3StorageOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3StorageOptionsProperty):
          software.amazon.awscdk.services.transfer.CfnServer.S3StorageOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IdentityProviderDetailsProperty {
    public fun directoryId(): String? = unwrap(this).getDirectoryId()

    public fun function(): String? = unwrap(this).getFunction()

    public fun invocationRole(): String? = unwrap(this).getInvocationRole()

    public fun sftpAuthenticationMethods(): String? = unwrap(this).getSftpAuthenticationMethods()

    public fun url(): String? = unwrap(this).getUrl()

    public interface Builder {
      public fun directoryId(directoryId: String) {
      }

      public fun function(function: String) {
      }

      public fun invocationRole(invocationRole: String) {
      }

      public fun sftpAuthenticationMethods(sftpAuthenticationMethods: String) {
      }

      public fun url(url: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnServer.IdentityProviderDetailsProperty.Builder
          =
          software.amazon.awscdk.services.transfer.CfnServer.IdentityProviderDetailsProperty.builder()

      public override fun directoryId(directoryId: String) {
        cdkBuilder.directoryId(directoryId)
      }

      public override fun function(function: String) {
        cdkBuilder.function(function)
      }

      public override fun invocationRole(invocationRole: String) {
        cdkBuilder.invocationRole(invocationRole)
      }

      public override fun sftpAuthenticationMethods(sftpAuthenticationMethods: String) {
        cdkBuilder.sftpAuthenticationMethods(sftpAuthenticationMethods)
      }

      public override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnServer.IdentityProviderDetailsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.transfer.CfnServer.IdentityProviderDetailsProperty,
    ) : IdentityProviderDetailsProperty {
      public override fun directoryId(): String? = unwrap(this).getDirectoryId()

      public override fun function(): String? = unwrap(this).getFunction()

      public override fun invocationRole(): String? = unwrap(this).getInvocationRole()

      public override fun sftpAuthenticationMethods(): String? =
          unwrap(this).getSftpAuthenticationMethods()

      public override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IdentityProviderDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnServer.IdentityProviderDetailsProperty):
          IdentityProviderDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IdentityProviderDetailsProperty):
          software.amazon.awscdk.services.transfer.CfnServer.IdentityProviderDetailsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface EndpointDetailsProperty {
    public fun addressAllocationIds(): List<String> = unwrap(this).getAddressAllocationIds() ?:
        emptyList()

    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    public fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

    public fun vpcId(): String? = unwrap(this).getVpcId()

    public interface Builder {
      public fun addressAllocationIds(addressAllocationIds: List<String>) {
      }

      public fun securityGroupIds(securityGroupIds: List<String>) {
      }

      public fun subnetIds(subnetIds: List<String>) {
      }

      public fun vpcEndpointId(vpcEndpointId: String) {
      }

      public fun vpcId(vpcId: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnServer.EndpointDetailsProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnServer.EndpointDetailsProperty.builder()

      public override fun addressAllocationIds(addressAllocationIds: List<String>) {
        cdkBuilder.addressAllocationIds(addressAllocationIds)
      }

      public override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      public override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      public override fun vpcEndpointId(vpcEndpointId: String) {
        cdkBuilder.vpcEndpointId(vpcEndpointId)
      }

      public override fun vpcId(vpcId: String) {
        cdkBuilder.vpcId(vpcId)
      }

      public fun build(): software.amazon.awscdk.services.transfer.CfnServer.EndpointDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.transfer.CfnServer.EndpointDetailsProperty,
    ) : EndpointDetailsProperty {
      public override fun addressAllocationIds(): List<String> =
          unwrap(this).getAddressAllocationIds() ?: emptyList()

      public override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      public override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

      public override fun vpcEndpointId(): String? = unwrap(this).getVpcEndpointId()

      public override fun vpcId(): String? = unwrap(this).getVpcId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EndpointDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnServer.EndpointDetailsProperty):
          EndpointDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EndpointDetailsProperty):
          software.amazon.awscdk.services.transfer.CfnServer.EndpointDetailsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
