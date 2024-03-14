package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnLocationObjectStorage internal constructor(
  private val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationObjectStorage,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accessKey(): String? = unwrap(this).getAccessKey()

  public open fun accessKey(`value`: String) {
    unwrap(this).setAccessKey(`value`)
  }

  public open fun agentArns(): List<String> = unwrap(this).getAgentArns()

  public open fun agentArns(`value`: List<String>) {
    unwrap(this).setAgentArns(`value`)
  }

  public open fun agentArns(vararg `value`: String): Unit = agentArns(`value`.toList())

  public open fun attrLocationArn(): String = unwrap(this).getAttrLocationArn()

  public open fun attrLocationUri(): String = unwrap(this).getAttrLocationUri()

  public open fun bucketName(): String? = unwrap(this).getBucketName()

  public open fun bucketName(`value`: String) {
    unwrap(this).setBucketName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun secretKey(): String? = unwrap(this).getSecretKey()

  public open fun secretKey(`value`: String) {
    unwrap(this).setSecretKey(`value`)
  }

  public open fun serverCertificate(): String? = unwrap(this).getServerCertificate()

  public open fun serverCertificate(`value`: String) {
    unwrap(this).setServerCertificate(`value`)
  }

  public open fun serverHostname(): String? = unwrap(this).getServerHostname()

  public open fun serverHostname(`value`: String) {
    unwrap(this).setServerHostname(`value`)
  }

  public open fun serverPort(): Number? = unwrap(this).getServerPort()

  public open fun serverPort(`value`: Number) {
    unwrap(this).setServerPort(`value`)
  }

  public open fun serverProtocol(): String? = unwrap(this).getServerProtocol()

  public open fun serverProtocol(`value`: String) {
    unwrap(this).setServerProtocol(`value`)
  }

  public open fun subdirectory(): String? = unwrap(this).getSubdirectory()

  public open fun subdirectory(`value`: String) {
    unwrap(this).setSubdirectory(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun accessKey(accessKey: String)

    public fun agentArns(agentArns: List<String>)

    public fun agentArns(vararg agentArns: String)

    public fun bucketName(bucketName: String)

    public fun secretKey(secretKey: String)

    public fun serverCertificate(serverCertificate: String)

    public fun serverHostname(serverHostname: String)

    public fun serverPort(serverPort: Number)

    public fun serverProtocol(serverProtocol: String)

    public fun subdirectory(subdirectory: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datasync.CfnLocationObjectStorage.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationObjectStorage.Builder.create(scope, id)

    override fun accessKey(accessKey: String) {
      cdkBuilder.accessKey(accessKey)
    }

    override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    override fun secretKey(secretKey: String) {
      cdkBuilder.secretKey(secretKey)
    }

    override fun serverCertificate(serverCertificate: String) {
      cdkBuilder.serverCertificate(serverCertificate)
    }

    override fun serverHostname(serverHostname: String) {
      cdkBuilder.serverHostname(serverHostname)
    }

    override fun serverPort(serverPort: Number) {
      cdkBuilder.serverPort(serverPort)
    }

    override fun serverProtocol(serverProtocol: String) {
      cdkBuilder.serverProtocol(serverProtocol)
    }

    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationObjectStorage =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnLocationObjectStorage {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnLocationObjectStorage(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationObjectStorage):
        CfnLocationObjectStorage = CfnLocationObjectStorage(cdkObject)

    internal fun unwrap(wrapped: CfnLocationObjectStorage):
        software.amazon.awscdk.services.datasync.CfnLocationObjectStorage = wrapped.cdkObject
  }
}
