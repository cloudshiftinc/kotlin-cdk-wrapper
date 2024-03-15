@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnConnector internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.transfer.CfnConnector,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accessRole(): String = unwrap(this).getAccessRole()

  public open fun accessRole(`value`: String) {
    unwrap(this).setAccessRole(`value`)
  }

  public open fun as2Config(): Any? = unwrap(this).getAs2Config()

  public open fun as2Config(`value`: Any) {
    unwrap(this).setAs2Config(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrConnectorId(): String = unwrap(this).getAttrConnectorId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun loggingRole(): String? = unwrap(this).getLoggingRole()

  public open fun loggingRole(`value`: String) {
    unwrap(this).setLoggingRole(`value`)
  }

  public open fun sftpConfig(): Any? = unwrap(this).getSftpConfig()

  public open fun sftpConfig(`value`: IResolvable) {
    unwrap(this).setSftpConfig(`value`.let(IResolvable::unwrap))
  }

  public open fun sftpConfig(`value`: SftpConfigProperty) {
    unwrap(this).setSftpConfig(`value`.let(SftpConfigProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("48dc8b5e1f62638ad400fbf6ab78f860243bbb09101238b3ce4e57d7a0381c84")
  public open fun sftpConfig(`value`: SftpConfigProperty.Builder.() -> Unit): Unit =
      sftpConfig(SftpConfigProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun url(): String = unwrap(this).getUrl()

  public open fun url(`value`: String) {
    unwrap(this).setUrl(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun accessRole(accessRole: String)

    public fun as2Config(as2Config: Any)

    public fun loggingRole(loggingRole: String)

    public fun sftpConfig(sftpConfig: IResolvable)

    public fun sftpConfig(sftpConfig: SftpConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("551491faf5309b95d20254db285f3de1430e0c6d356bcef2291e1b6349cbf9d5")
    public fun sftpConfig(sftpConfig: SftpConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun url(url: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnConnector.Builder =
        software.amazon.awscdk.services.transfer.CfnConnector.Builder.create(scope, id)

    override fun accessRole(accessRole: String) {
      cdkBuilder.accessRole(accessRole)
    }

    override fun as2Config(as2Config: Any) {
      cdkBuilder.as2Config(as2Config)
    }

    override fun loggingRole(loggingRole: String) {
      cdkBuilder.loggingRole(loggingRole)
    }

    override fun sftpConfig(sftpConfig: IResolvable) {
      cdkBuilder.sftpConfig(sftpConfig.let(IResolvable::unwrap))
    }

    override fun sftpConfig(sftpConfig: SftpConfigProperty) {
      cdkBuilder.sftpConfig(sftpConfig.let(SftpConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("551491faf5309b95d20254db285f3de1430e0c6d356bcef2291e1b6349cbf9d5")
    override fun sftpConfig(sftpConfig: SftpConfigProperty.Builder.() -> Unit): Unit =
        sftpConfig(SftpConfigProperty(sftpConfig))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun url(url: String) {
      cdkBuilder.url(url)
    }

    public fun build(): software.amazon.awscdk.services.transfer.CfnConnector = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.transfer.CfnConnector.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnector {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnector(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnConnector):
        CfnConnector = CfnConnector(cdkObject)

    internal fun unwrap(wrapped: CfnConnector):
        software.amazon.awscdk.services.transfer.CfnConnector = wrapped.cdkObject
  }

  public interface SftpConfigProperty {
    public fun trustedHostKeys(): List<String> = unwrap(this).getTrustedHostKeys() ?: emptyList()

    public fun userSecretId(): String? = unwrap(this).getUserSecretId()

    @CdkDslMarker
    public interface Builder {
      public fun trustedHostKeys(trustedHostKeys: List<String>)

      public fun trustedHostKeys(vararg trustedHostKeys: String)

      public fun userSecretId(userSecretId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnConnector.SftpConfigProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnConnector.SftpConfigProperty.builder()

      override fun trustedHostKeys(trustedHostKeys: List<String>) {
        cdkBuilder.trustedHostKeys(trustedHostKeys)
      }

      override fun trustedHostKeys(vararg trustedHostKeys: String): Unit =
          trustedHostKeys(trustedHostKeys.toList())

      override fun userSecretId(userSecretId: String) {
        cdkBuilder.userSecretId(userSecretId)
      }

      public fun build(): software.amazon.awscdk.services.transfer.CfnConnector.SftpConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.transfer.CfnConnector.SftpConfigProperty,
    ) : CdkObject(cdkObject), SftpConfigProperty {
      override fun trustedHostKeys(): List<String> = unwrap(this).getTrustedHostKeys() ?:
          emptyList()

      override fun userSecretId(): String? = unwrap(this).getUserSecretId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SftpConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnConnector.SftpConfigProperty):
          SftpConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SftpConfigProperty):
          software.amazon.awscdk.services.transfer.CfnConnector.SftpConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnConnector.SftpConfigProperty
    }
  }

  public interface As2ConfigProperty {
    public fun basicAuthSecretId(): String? = unwrap(this).getBasicAuthSecretId()

    public fun compression(): String? = unwrap(this).getCompression()

    public fun encryptionAlgorithm(): String? = unwrap(this).getEncryptionAlgorithm()

    public fun localProfileId(): String? = unwrap(this).getLocalProfileId()

    public fun mdnResponse(): String? = unwrap(this).getMdnResponse()

    public fun mdnSigningAlgorithm(): String? = unwrap(this).getMdnSigningAlgorithm()

    public fun messageSubject(): String? = unwrap(this).getMessageSubject()

    public fun partnerProfileId(): String? = unwrap(this).getPartnerProfileId()

    public fun signingAlgorithm(): String? = unwrap(this).getSigningAlgorithm()

    @CdkDslMarker
    public interface Builder {
      public fun basicAuthSecretId(basicAuthSecretId: String)

      public fun compression(compression: String)

      public fun encryptionAlgorithm(encryptionAlgorithm: String)

      public fun localProfileId(localProfileId: String)

      public fun mdnResponse(mdnResponse: String)

      public fun mdnSigningAlgorithm(mdnSigningAlgorithm: String)

      public fun messageSubject(messageSubject: String)

      public fun partnerProfileId(partnerProfileId: String)

      public fun signingAlgorithm(signingAlgorithm: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnConnector.As2ConfigProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnConnector.As2ConfigProperty.builder()

      override fun basicAuthSecretId(basicAuthSecretId: String) {
        cdkBuilder.basicAuthSecretId(basicAuthSecretId)
      }

      override fun compression(compression: String) {
        cdkBuilder.compression(compression)
      }

      override fun encryptionAlgorithm(encryptionAlgorithm: String) {
        cdkBuilder.encryptionAlgorithm(encryptionAlgorithm)
      }

      override fun localProfileId(localProfileId: String) {
        cdkBuilder.localProfileId(localProfileId)
      }

      override fun mdnResponse(mdnResponse: String) {
        cdkBuilder.mdnResponse(mdnResponse)
      }

      override fun mdnSigningAlgorithm(mdnSigningAlgorithm: String) {
        cdkBuilder.mdnSigningAlgorithm(mdnSigningAlgorithm)
      }

      override fun messageSubject(messageSubject: String) {
        cdkBuilder.messageSubject(messageSubject)
      }

      override fun partnerProfileId(partnerProfileId: String) {
        cdkBuilder.partnerProfileId(partnerProfileId)
      }

      override fun signingAlgorithm(signingAlgorithm: String) {
        cdkBuilder.signingAlgorithm(signingAlgorithm)
      }

      public fun build(): software.amazon.awscdk.services.transfer.CfnConnector.As2ConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.transfer.CfnConnector.As2ConfigProperty,
    ) : CdkObject(cdkObject), As2ConfigProperty {
      override fun basicAuthSecretId(): String? = unwrap(this).getBasicAuthSecretId()

      override fun compression(): String? = unwrap(this).getCompression()

      override fun encryptionAlgorithm(): String? = unwrap(this).getEncryptionAlgorithm()

      override fun localProfileId(): String? = unwrap(this).getLocalProfileId()

      override fun mdnResponse(): String? = unwrap(this).getMdnResponse()

      override fun mdnSigningAlgorithm(): String? = unwrap(this).getMdnSigningAlgorithm()

      override fun messageSubject(): String? = unwrap(this).getMessageSubject()

      override fun partnerProfileId(): String? = unwrap(this).getPartnerProfileId()

      override fun signingAlgorithm(): String? = unwrap(this).getSigningAlgorithm()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): As2ConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnConnector.As2ConfigProperty):
          As2ConfigProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: As2ConfigProperty):
          software.amazon.awscdk.services.transfer.CfnConnector.As2ConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.transfer.CfnConnector.As2ConfigProperty
    }
  }
}
