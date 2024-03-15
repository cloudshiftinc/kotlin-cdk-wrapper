@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface KeyPairAttributes {
  public fun keyPairName(): String

  public fun type(): KeyPairType? = unwrap(this).getType()?.let(KeyPairType::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun keyPairName(keyPairName: String)

    public fun type(type: KeyPairType)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.KeyPairAttributes.Builder =
        software.amazon.awscdk.services.ec2.KeyPairAttributes.builder()

    override fun keyPairName(keyPairName: String) {
      cdkBuilder.keyPairName(keyPairName)
    }

    override fun type(type: KeyPairType) {
      cdkBuilder.type(type.let(KeyPairType::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.KeyPairAttributes = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.KeyPairAttributes,
  ) : CdkObject(cdkObject), KeyPairAttributes {
    override fun keyPairName(): String = unwrap(this).getKeyPairName()

    override fun type(): KeyPairType? = unwrap(this).getType()?.let(KeyPairType::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): KeyPairAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.KeyPairAttributes):
        KeyPairAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: KeyPairAttributes):
        software.amazon.awscdk.services.ec2.KeyPairAttributes = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.KeyPairAttributes
  }
}
