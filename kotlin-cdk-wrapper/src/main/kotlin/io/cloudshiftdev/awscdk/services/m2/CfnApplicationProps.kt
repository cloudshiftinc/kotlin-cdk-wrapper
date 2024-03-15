@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.m2

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnApplicationProps {
  public fun definition(): Any

  public fun description(): String? = unwrap(this).getDescription()

  public fun engineType(): String

  public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

  public fun name(): String

  public fun roleArn(): String? = unwrap(this).getRoleArn()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun definition(definition: IResolvable)

    public fun definition(definition: CfnApplication.DefinitionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db0d71a903c09c49ec95c15a8b9b87af5e22ba5b3c3d3be9b8d9c60388d4293d")
    public fun definition(definition: CfnApplication.DefinitionProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun engineType(engineType: String)

    public fun kmsKeyId(kmsKeyId: String)

    public fun name(name: String)

    public fun roleArn(roleArn: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.m2.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.m2.CfnApplicationProps.builder()

    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    override fun definition(definition: CfnApplication.DefinitionProperty) {
      cdkBuilder.definition(definition.let(CfnApplication.DefinitionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("db0d71a903c09c49ec95c15a8b9b87af5e22ba5b3c3d3be9b8d9c60388d4293d")
    override fun definition(definition: CfnApplication.DefinitionProperty.Builder.() -> Unit): Unit
        = definition(CfnApplication.DefinitionProperty(definition))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun engineType(engineType: String) {
      cdkBuilder.engineType(engineType)
    }

    override fun kmsKeyId(kmsKeyId: String) {
      cdkBuilder.kmsKeyId(kmsKeyId)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.m2.CfnApplicationProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.m2.CfnApplicationProps,
  ) : CdkObject(cdkObject), CfnApplicationProps {
    override fun definition(): Any = unwrap(this).getDefinition()

    override fun description(): String? = unwrap(this).getDescription()

    override fun engineType(): String = unwrap(this).getEngineType()

    override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    override fun name(): String = unwrap(this).getName()

    override fun roleArn(): String? = unwrap(this).getRoleArn()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.m2.CfnApplicationProps):
        CfnApplicationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.m2.CfnApplicationProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.m2.CfnApplicationProps
  }
}
