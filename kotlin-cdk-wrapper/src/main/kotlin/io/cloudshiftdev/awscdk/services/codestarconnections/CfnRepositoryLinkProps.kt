@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codestarconnections

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRepositoryLinkProps {
  public fun connectionArn(): String

  public fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

  public fun ownerId(): String

  public fun repositoryName(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun connectionArn(connectionArn: String)

    public fun encryptionKeyArn(encryptionKeyArn: String)

    public fun ownerId(ownerId: String)

    public fun repositoryName(repositoryName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codestarconnections.CfnRepositoryLinkProps.Builder =
        software.amazon.awscdk.services.codestarconnections.CfnRepositoryLinkProps.builder()

    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    override fun encryptionKeyArn(encryptionKeyArn: String) {
      cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    override fun ownerId(ownerId: String) {
      cdkBuilder.ownerId(ownerId)
    }

    override fun repositoryName(repositoryName: String) {
      cdkBuilder.repositoryName(repositoryName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.codestarconnections.CfnRepositoryLinkProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codestarconnections.CfnRepositoryLinkProps,
  ) : CdkObject(cdkObject), CfnRepositoryLinkProps {
    override fun connectionArn(): String = unwrap(this).getConnectionArn()

    override fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

    override fun ownerId(): String = unwrap(this).getOwnerId()

    override fun repositoryName(): String = unwrap(this).getRepositoryName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRepositoryLinkProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codestarconnections.CfnRepositoryLinkProps):
        CfnRepositoryLinkProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRepositoryLinkProps):
        software.amazon.awscdk.services.codestarconnections.CfnRepositoryLinkProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codestarconnections.CfnRepositoryLinkProps
  }
}
