@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Abstract AppSync datasource implementation.
 *
 * Do not use directly but use subclasses for concrete datasources
 *
 * Example:
 *
 * ```
 * GraphqlApi api;
 * AppsyncFunction appsyncFunction;
 * Resolver pipelineResolver = Resolver.Builder.create(this, "pipeline")
 * .api(api)
 * .dataSource(api.addNoneDataSource("none"))
 * .typeName("typeName")
 * .fieldName("fieldName")
 * .requestMappingTemplate(MappingTemplate.fromFile("beforeRequest.vtl"))
 * .pipelineConfig(List.of(appsyncFunction))
 * .responseMappingTemplate(MappingTemplate.fromFile("afterResponse.vtl"))
 * .build();
 * ```
 */
public abstract class BaseDataSource(
  cdkObject: software.amazon.awscdk.services.appsync.BaseDataSource,
) : Construct(cdkObject) {
  /**
   * creates a new appsync function for this datasource and API using the given properties.
   *
   * @param id 
   * @param props 
   */
  public open fun createFunction(id: String, props: BaseAppsyncFunctionProps): AppsyncFunction =
      unwrap(this).createFunction(id,
      props.let(BaseAppsyncFunctionProps.Companion::unwrap)).let(AppsyncFunction::wrap)

  /**
   * creates a new appsync function for this datasource and API using the given properties.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
      unwrap(this).createResolver(id,
      props.let(BaseResolverProps.Companion::unwrap)).let(Resolver::wrap)

  /**
   * creates a new resolver for this datasource and API using the given properties.
   *
   * @param id 
   * @param props 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.BaseDataSource,
  ) : BaseDataSource(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.BaseDataSource):
        BaseDataSource = CdkObjectWrappers.wrap(cdkObject) as? BaseDataSource ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseDataSource):
        software.amazon.awscdk.services.appsync.BaseDataSource = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.BaseDataSource
  }
}
