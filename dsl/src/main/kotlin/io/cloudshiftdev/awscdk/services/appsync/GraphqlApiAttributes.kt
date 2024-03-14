package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String
import kotlin.Unit

public interface GraphqlApiAttributes {
  public fun graphqlApiArn(): String? = unwrap(this).getGraphqlApiArn()

  public fun graphqlApiId(): String

  public interface Builder {
    public fun graphqlApiArn(graphqlApiArn: String) {
    }

    public fun graphqlApiId(graphqlApiId: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.GraphqlApiAttributes.Builder =
        software.amazon.awscdk.services.appsync.GraphqlApiAttributes.builder()

    public override fun graphqlApiArn(graphqlApiArn: String) {
      cdkBuilder.graphqlApiArn(graphqlApiArn)
    }

    public override fun graphqlApiId(graphqlApiId: String) {
      cdkBuilder.graphqlApiId(graphqlApiId)
    }

    public fun build(): software.amazon.awscdk.services.appsync.GraphqlApiAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.GraphqlApiAttributes,
  ) : GraphqlApiAttributes {
    public override fun graphqlApiArn(): String? = unwrap(this).getGraphqlApiArn()

    public override fun graphqlApiId(): String = unwrap(this).getGraphqlApiId()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): GraphqlApiAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.GraphqlApiAttributes):
        GraphqlApiAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: GraphqlApiAttributes):
        software.amazon.awscdk.services.appsync.GraphqlApiAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
