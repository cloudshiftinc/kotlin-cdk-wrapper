package io.cloudshiftdev.awscdk.services.codepipeline

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface CustomActionProperty {
  public fun description(): String? = unwrap(this).getDescription()

  public fun key(): Boolean? = unwrap(this).getKey()

  public fun name(): String

  public fun queryable(): Boolean? = unwrap(this).getQueryable()

  public fun required(): Boolean

  public fun secret(): Boolean? = unwrap(this).getSecret()

  public fun type(): String? = unwrap(this).getType()

  public interface Builder {
    public fun description(description: String) {
    }

    public fun key(key: Boolean) {
    }

    public fun name(name: String) {
    }

    public fun queryable(queryable: Boolean) {
    }

    public fun required(required: Boolean) {
    }

    public fun secret(secret: Boolean) {
    }

    public fun type(type: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.CustomActionProperty.Builder =
        software.amazon.awscdk.services.codepipeline.CustomActionProperty.builder()

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun key(key: Boolean) {
      cdkBuilder.key(key)
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun queryable(queryable: Boolean) {
      cdkBuilder.queryable(queryable)
    }

    public override fun required(required: Boolean) {
      cdkBuilder.required(required)
    }

    public override fun secret(secret: Boolean) {
      cdkBuilder.secret(secret)
    }

    public override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.CustomActionProperty =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.codepipeline.CustomActionProperty,
  ) : CustomActionProperty {
    public override fun description(): String? = unwrap(this).getDescription()

    public override fun key(): Boolean? = unwrap(this).getKey()

    public override fun name(): String = unwrap(this).getName()

    public override fun queryable(): Boolean? = unwrap(this).getQueryable()

    public override fun required(): Boolean = unwrap(this).getRequired()

    public override fun secret(): Boolean? = unwrap(this).getSecret()

    public override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): CustomActionProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CustomActionProperty):
        CustomActionProperty = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomActionProperty):
        software.amazon.awscdk.services.codepipeline.CustomActionProperty = (wrapped as
        Wrapper).cdkObject
  }
}
