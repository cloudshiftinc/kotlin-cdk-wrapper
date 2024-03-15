@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.secretsmanager

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnSecretProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun generateSecretString(): Any? = unwrap(this).getGenerateSecretString()

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun name(): String? = unwrap(this).getName()

  public fun replicaRegions(): Any? = unwrap(this).getReplicaRegions()

  public fun secretString(): String? = unwrap(this).getSecretString()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun generateSecretString(generateSecretString: IResolvable)

    public fun generateSecretString(generateSecretString: CfnSecret.GenerateSecretStringProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35ff43f4d5ee80c90bc5913c560a812ae2dd2c82b5c1adbeb1f76f152b17850b")
    public
        fun generateSecretString(generateSecretString: CfnSecret.GenerateSecretStringProperty.Builder.() -> Unit)

    public fun kmsKeyId(kmsKeyId: String)

    public fun name(name: String)

    public fun replicaRegions(replicaRegions: IResolvable)

    public fun replicaRegions(replicaRegions: List<Any>)

    public fun replicaRegions(vararg replicaRegions: Any)

    public fun secretString(secretString: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.secretsmanager.CfnSecretProps.Builder =
        software.amazon.awscdk.services.secretsmanager.CfnSecretProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun generateSecretString(generateSecretString: IResolvable) {
      cdkBuilder.generateSecretString(generateSecretString.let(IResolvable::unwrap))
    }

    override
        fun generateSecretString(generateSecretString: CfnSecret.GenerateSecretStringProperty) {
      cdkBuilder.generateSecretString(generateSecretString.let(CfnSecret.GenerateSecretStringProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("35ff43f4d5ee80c90bc5913c560a812ae2dd2c82b5c1adbeb1f76f152b17850b")
    override
        fun generateSecretString(generateSecretString: CfnSecret.GenerateSecretStringProperty.Builder.() -> Unit):
        Unit = generateSecretString(CfnSecret.GenerateSecretStringProperty(generateSecretString))

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun replicaRegions(replicaRegions: IResolvable) {
      cdkBuilder.replicaRegions(replicaRegions.let(IResolvable::unwrap))
    }

    override fun replicaRegions(replicaRegions: List<Any>) {
      cdkBuilder.replicaRegions(replicaRegions)
    }

    override fun replicaRegions(vararg replicaRegions: Any): Unit =
        replicaRegions(replicaRegions.toList())

    override fun secretString(secretString: String) {
      cdkBuilder.secretString(secretString)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.secretsmanager.CfnSecretProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.secretsmanager.CfnSecretProps,
  ) : CdkObject(cdkObject), CfnSecretProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun generateSecretString(): Any? = unwrap(this).getGenerateSecretString()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun name(): String? = unwrap(this).getName()

    override fun replicaRegions(): Any? = unwrap(this).getReplicaRegions()

    override fun secretString(): String? = unwrap(this).getSecretString()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecretProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.secretsmanager.CfnSecretProps):
        CfnSecretProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecretProps):
        software.amazon.awscdk.services.secretsmanager.CfnSecretProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.secretsmanager.CfnSecretProps
  }
}
