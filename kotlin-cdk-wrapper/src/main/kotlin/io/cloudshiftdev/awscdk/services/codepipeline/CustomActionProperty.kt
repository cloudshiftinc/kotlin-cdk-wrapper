@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
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

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun key(key: Boolean)

    public fun name(name: String)

    public fun queryable(queryable: Boolean)

    public fun required(required: Boolean)

    public fun secret(secret: Boolean)

    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codepipeline.CustomActionProperty.Builder =
        software.amazon.awscdk.services.codepipeline.CustomActionProperty.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun key(key: Boolean) {
      cdkBuilder.key(key)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun queryable(queryable: Boolean) {
      cdkBuilder.queryable(queryable)
    }

    override fun required(required: Boolean) {
      cdkBuilder.required(required)
    }

    override fun secret(secret: Boolean) {
      cdkBuilder.secret(secret)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.CustomActionProperty =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.CustomActionProperty,
  ) : CdkObject(cdkObject), CustomActionProperty {
    override fun description(): String? = unwrap(this).getDescription()

    override fun key(): Boolean? = unwrap(this).getKey()

    override fun name(): String = unwrap(this).getName()

    override fun queryable(): Boolean? = unwrap(this).getQueryable()

    override fun required(): Boolean = unwrap(this).getRequired()

    override fun secret(): Boolean? = unwrap(this).getSecret()

    override fun type(): String? = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CustomActionProperty {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.CustomActionProperty):
        CustomActionProperty = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CustomActionProperty):
        software.amazon.awscdk.services.codepipeline.CustomActionProperty = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.CustomActionProperty
  }
}
