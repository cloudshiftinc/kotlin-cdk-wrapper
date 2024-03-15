@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.personalize

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnSchemaProps {
  public fun domain(): String? = unwrap(this).getDomain()

  public fun name(): String

  public fun schema(): String

  @CdkDslMarker
  public interface Builder {
    public fun domain(domain: String)

    public fun name(name: String)

    public fun schema(schema: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.personalize.CfnSchemaProps.Builder =
        software.amazon.awscdk.services.personalize.CfnSchemaProps.builder()

    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun schema(schema: String) {
      cdkBuilder.schema(schema)
    }

    public fun build(): software.amazon.awscdk.services.personalize.CfnSchemaProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.personalize.CfnSchemaProps,
  ) : CdkObject(cdkObject), CfnSchemaProps {
    override fun domain(): String? = unwrap(this).getDomain()

    override fun name(): String = unwrap(this).getName()

    override fun schema(): String = unwrap(this).getSchema()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSchemaProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.personalize.CfnSchemaProps):
        CfnSchemaProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSchemaProps):
        software.amazon.awscdk.services.personalize.CfnSchemaProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.personalize.CfnSchemaProps
  }
}
