@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnGraphQLSchema internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLSchema,
) : CfnResource(cdkObject), IInspectable {
  public open fun apiId(): String = unwrap(this).getApiId()

  public open fun apiId(`value`: String) {
    unwrap(this).setApiId(`value`)
  }

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun definition(): String? = unwrap(this).getDefinition()

  public open fun definition(`value`: String) {
    unwrap(this).setDefinition(`value`)
  }

  public open fun definitionS3Location(): String? = unwrap(this).getDefinitionS3Location()

  public open fun definitionS3Location(`value`: String) {
    unwrap(this).setDefinitionS3Location(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  @CdkDslMarker
  public interface Builder {
    public fun apiId(apiId: String)

    public fun definition(definition: String)

    public fun definitionS3Location(definitionS3Location: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnGraphQLSchema.Builder =
        software.amazon.awscdk.services.appsync.CfnGraphQLSchema.Builder.create(scope, id)

    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    override fun definition(definition: String) {
      cdkBuilder.definition(definition)
    }

    override fun definitionS3Location(definitionS3Location: String) {
      cdkBuilder.definitionS3Location(definitionS3Location)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnGraphQLSchema =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.appsync.CfnGraphQLSchema.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGraphQLSchema {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGraphQLSchema(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnGraphQLSchema):
        CfnGraphQLSchema = CfnGraphQLSchema(cdkObject)

    internal fun unwrap(wrapped: CfnGraphQLSchema):
        software.amazon.awscdk.services.appsync.CfnGraphQLSchema = wrapped.cdkObject
  }
}
