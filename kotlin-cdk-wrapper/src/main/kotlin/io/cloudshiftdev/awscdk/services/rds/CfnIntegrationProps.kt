@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface CfnIntegrationProps {
  public fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

  public fun integrationName(): String? = unwrap(this).getIntegrationName()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun sourceArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun targetArn(): String

  @CdkDslMarker
  public interface Builder {
    public fun additionalEncryptionContext(additionalEncryptionContext: IResolvable)

    public fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>)

    public fun integrationName(integrationName: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun sourceArn(sourceArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun targetArn(targetArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.CfnIntegrationProps.Builder =
        software.amazon.awscdk.services.rds.CfnIntegrationProps.builder()

    override fun additionalEncryptionContext(additionalEncryptionContext: IResolvable) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext.let(IResolvable::unwrap))
    }

    override fun additionalEncryptionContext(additionalEncryptionContext: Map<String, String>) {
      cdkBuilder.additionalEncryptionContext(additionalEncryptionContext)
    }

    override fun integrationName(integrationName: String) {
      cdkBuilder.integrationName(integrationName)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun sourceArn(sourceArn: String) {
      cdkBuilder.sourceArn(sourceArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun targetArn(targetArn: String) {
      cdkBuilder.targetArn(targetArn)
    }

    public fun build(): software.amazon.awscdk.services.rds.CfnIntegrationProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.CfnIntegrationProps,
  ) : CdkObject(cdkObject), CfnIntegrationProps {
    override fun additionalEncryptionContext(): Any? = unwrap(this).getAdditionalEncryptionContext()

    override fun integrationName(): String? = unwrap(this).getIntegrationName()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun sourceArn(): String = unwrap(this).getSourceArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun targetArn(): String = unwrap(this).getTargetArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIntegrationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.CfnIntegrationProps):
        CfnIntegrationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIntegrationProps):
        software.amazon.awscdk.services.rds.CfnIntegrationProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.rds.CfnIntegrationProps
  }
}
