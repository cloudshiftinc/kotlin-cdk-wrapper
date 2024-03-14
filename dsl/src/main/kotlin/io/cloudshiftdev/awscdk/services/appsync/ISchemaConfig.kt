package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String

public interface ISchemaConfig {
  public fun apiId(): String

  public fun apiId(arg0: String)

  public fun definition(): String

  public fun definition(arg0: String)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.ISchemaConfig,
  ) : ISchemaConfig {
    public override fun apiId(): String = unwrap(this).getApiId()

    public override fun apiId(arg0: String) {
      unwrap(this).setApiId(arg0)
    }

    public override fun definition(): String = unwrap(this).getDefinition()

    public override fun definition(arg0: String) {
      unwrap(this).setDefinition(arg0)
    }
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.ISchemaConfig):
        ISchemaConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ISchemaConfig):
        software.amazon.awscdk.services.appsync.ISchemaConfig = (wrapped as Wrapper).cdkObject
  }
}
