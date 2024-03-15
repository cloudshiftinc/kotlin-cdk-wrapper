@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnGraphQLSchemaProps {
  public fun apiId(): String

  public fun definition(): String? = unwrap(this).getDefinition()

  public fun definitionS3Location(): String? = unwrap(this).getDefinitionS3Location()

  @CdkDslMarker
  public interface Builder {
    public fun apiId(apiId: String)

    public fun definition(definition: String)

    public fun definitionS3Location(definitionS3Location: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps.Builder =
        software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps.builder()

    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    override fun definition(definition: String) {
      cdkBuilder.definition(definition)
    }

    override fun definitionS3Location(definitionS3Location: String) {
      cdkBuilder.definitionS3Location(definitionS3Location)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps,
  ) : CdkObject(cdkObject), CfnGraphQLSchemaProps {
    override fun apiId(): String = unwrap(this).getApiId()

    override fun definition(): String? = unwrap(this).getDefinition()

    override fun definitionS3Location(): String? = unwrap(this).getDefinitionS3Location()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnGraphQLSchemaProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps):
        CfnGraphQLSchemaProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnGraphQLSchemaProps):
        software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps
  }
}
