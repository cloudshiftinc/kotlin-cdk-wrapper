@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnLocationObjectStorageProps {
  public fun accessKey(): String? = unwrap(this).getAccessKey()

  public fun agentArns(): List<String>

  public fun bucketName(): String? = unwrap(this).getBucketName()

  public fun secretKey(): String? = unwrap(this).getSecretKey()

  public fun serverCertificate(): String? = unwrap(this).getServerCertificate()

  public fun serverHostname(): String? = unwrap(this).getServerHostname()

  public fun serverPort(): Number? = unwrap(this).getServerPort()

  public fun serverProtocol(): String? = unwrap(this).getServerProtocol()

  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
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

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps.builder()

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

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps,
  ) : CdkObject(cdkObject), CfnLocationObjectStorageProps {
    override fun accessKey(): String? = unwrap(this).getAccessKey()

    override fun agentArns(): List<String> = unwrap(this).getAgentArns()

    override fun bucketName(): String? = unwrap(this).getBucketName()

    override fun secretKey(): String? = unwrap(this).getSecretKey()

    override fun serverCertificate(): String? = unwrap(this).getServerCertificate()

    override fun serverHostname(): String? = unwrap(this).getServerHostname()

    override fun serverPort(): Number? = unwrap(this).getServerPort()

    override fun serverProtocol(): String? = unwrap(this).getServerProtocol()

    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationObjectStorageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps):
        CfnLocationObjectStorageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationObjectStorageProps):
        software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.datasync.CfnLocationObjectStorageProps
  }
}
