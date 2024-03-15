@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codegurureviewer

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRepositoryAssociationProps {
  public fun bucketName(): String? = unwrap(this).getBucketName()

  public fun connectionArn(): String? = unwrap(this).getConnectionArn()

  public fun name(): String

  public fun owner(): String? = unwrap(this).getOwner()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String

  @CdkDslMarker
  public interface Builder {
    public fun bucketName(bucketName: String)

    public fun connectionArn(connectionArn: String)

    public fun name(name: String)

    public fun owner(owner: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociationProps.Builder =
        software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociationProps.builder()

    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun owner(owner: String) {
      cdkBuilder.owner(owner)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build():
        software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociationProps,
  ) : CdkObject(cdkObject), CfnRepositoryAssociationProps {
    override fun bucketName(): String? = unwrap(this).getBucketName()

    override fun connectionArn(): String? = unwrap(this).getConnectionArn()

    override fun name(): String = unwrap(this).getName()

    override fun owner(): String? = unwrap(this).getOwner()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRepositoryAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociationProps):
        CfnRepositoryAssociationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRepositoryAssociationProps):
        software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociationProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociationProps
  }
}
