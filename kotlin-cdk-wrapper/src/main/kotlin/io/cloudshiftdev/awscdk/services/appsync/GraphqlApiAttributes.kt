@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface GraphqlApiAttributes {
  public fun graphqlApiArn(): String? = unwrap(this).getGraphqlApiArn()

  public fun graphqlApiId(): String

  @CdkDslMarker
  public interface Builder {
    public fun graphqlApiArn(graphqlApiArn: String)

    public fun graphqlApiId(graphqlApiId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.GraphqlApiAttributes.Builder =
        software.amazon.awscdk.services.appsync.GraphqlApiAttributes.builder()

    override fun graphqlApiArn(graphqlApiArn: String) {
      cdkBuilder.graphqlApiArn(graphqlApiArn)
    }

    override fun graphqlApiId(graphqlApiId: String) {
      cdkBuilder.graphqlApiId(graphqlApiId)
    }

    public fun build(): software.amazon.awscdk.services.appsync.GraphqlApiAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.GraphqlApiAttributes,
  ) : CdkObject(cdkObject), GraphqlApiAttributes {
    override fun graphqlApiArn(): String? = unwrap(this).getGraphqlApiArn()

    override fun graphqlApiId(): String = unwrap(this).getGraphqlApiId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GraphqlApiAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.GraphqlApiAttributes):
        GraphqlApiAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GraphqlApiAttributes):
        software.amazon.awscdk.services.appsync.GraphqlApiAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.GraphqlApiAttributes
  }
}
