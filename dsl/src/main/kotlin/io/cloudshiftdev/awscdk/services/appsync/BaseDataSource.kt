package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class BaseDataSource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.appsync.BaseDataSource,
) : Construct(cdkObject) {
  /**
   * creates a new appsync function for this datasource and API using the given properties.
   *
   * @param id 
   * @param props 
   */
  public open fun createFunction(id: String, props: BaseAppsyncFunctionProps): AppsyncFunction =
      unwrap(this).createFunction(id,
      props.let(BaseAppsyncFunctionProps::unwrap)).let(AppsyncFunction::wrap)

  /**
   * creates a new appsync function for this datasource and API using the given properties.
   *
   * @param id 
   * @param props 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2cb4d23134db86c074c6cd917abd61a6f9d01b83b3b732b70c1562892cc4e434")
  public open fun createFunction(id: String, props: BaseAppsyncFunctionProps.Builder.() -> Unit):
      AppsyncFunction = createFunction(id, BaseAppsyncFunctionProps(props))

  /**
   * creates a new resolver for this datasource and API using the given properties.
   *
   * @param id 
   * @param props 
   */
  public open fun createResolver(id: String, props: BaseResolverProps): Resolver =
      unwrap(this).createResolver(id, props.let(BaseResolverProps::unwrap)).let(Resolver::wrap)

  /**
   * creates a new resolver for this datasource and API using the given properties.
   *
   * @param id 
   * @param props 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b51cac59b24bd14c924ea64ac13c57fb64320b6849bd681cc0f79edf0953ef2e")
  public open fun createResolver(id: String, props: BaseResolverProps.Builder.() -> Unit): Resolver
      = createResolver(id, BaseResolverProps(props))

  /**
   * the underlying CFN data source resource.
   */
  public open fun ds(): CfnDataSource = unwrap(this).getDs().let(CfnDataSource::wrap)

  /**
   * the name of the data source.
   */
  public open fun name(): String = unwrap(this).getName()

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.BaseDataSource,
  ) : BaseDataSource(cdkObject)

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.BaseDataSource):
        BaseDataSource = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseDataSource):
        software.amazon.awscdk.services.appsync.BaseDataSource = (wrapped as Wrapper).cdkObject
  }
}
