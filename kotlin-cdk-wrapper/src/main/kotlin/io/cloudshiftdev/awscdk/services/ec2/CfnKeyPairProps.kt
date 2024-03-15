@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnKeyPairProps {
  public fun keyFormat(): String? = unwrap(this).getKeyFormat()

  public fun keyName(): String

  public fun keyType(): String? = unwrap(this).getKeyType()

  public fun publicKeyMaterial(): String? = unwrap(this).getPublicKeyMaterial()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun keyFormat(keyFormat: String)

    public fun keyName(keyName: String)

    public fun keyType(keyType: String)

    public fun publicKeyMaterial(publicKeyMaterial: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnKeyPairProps.Builder =
        software.amazon.awscdk.services.ec2.CfnKeyPairProps.builder()

    override fun keyFormat(keyFormat: String) {
      cdkBuilder.keyFormat(keyFormat)
    }

    override fun keyName(keyName: String) {
      cdkBuilder.keyName(keyName)
    }

    override fun keyType(keyType: String) {
      cdkBuilder.keyType(keyType)
    }

    override fun publicKeyMaterial(publicKeyMaterial: String) {
      cdkBuilder.publicKeyMaterial(publicKeyMaterial)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.ec2.CfnKeyPairProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnKeyPairProps,
  ) : CdkObject(cdkObject), CfnKeyPairProps {
    override fun keyFormat(): String? = unwrap(this).getKeyFormat()

    override fun keyName(): String = unwrap(this).getKeyName()

    override fun keyType(): String? = unwrap(this).getKeyType()

    override fun publicKeyMaterial(): String? = unwrap(this).getPublicKeyMaterial()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnKeyPairProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnKeyPairProps):
        CfnKeyPairProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnKeyPairProps):
        software.amazon.awscdk.services.ec2.CfnKeyPairProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.CfnKeyPairProps
  }
}
