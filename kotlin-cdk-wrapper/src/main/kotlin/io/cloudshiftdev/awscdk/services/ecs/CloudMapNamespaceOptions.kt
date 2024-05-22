@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.servicediscovery.NamespaceType
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * The options for creating an AWS Cloud Map namespace.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * TaskDefinition taskDefinition;
 * ContainerDefinitionOptions containerOptions;
 * ContainerDefinition container = taskDefinition.addContainer("MyContainer", containerOptions);
 * container.addPortMappings(PortMapping.builder()
 * .name("api")
 * .containerPort(8080)
 * .build());
 * cluster.addDefaultCloudMapNamespace(CloudMapNamespaceOptions.builder()
 * .name("local")
 * .build());
 * FargateService service = FargateService.Builder.create(this, "Service")
 * .cluster(cluster)
 * .taskDefinition(taskDefinition)
 * .serviceConnectConfiguration(ServiceConnectProps.builder()
 * .services(List.of(ServiceConnectService.builder()
 * .portMappingName("api")
 * .dnsName("http-api")
 * .port(80)
 * .build()))
 * .build())
 * .build();
 * ```
 */
public interface CloudMapNamespaceOptions {
  /**
   * The name of the namespace, such as example.com.
   */
  public fun name(): String

  /**
   * The type of CloudMap Namespace to create.
   *
   * Default: PrivateDns
   */
  public fun type(): NamespaceType? = unwrap(this).getType()?.let(NamespaceType::wrap)

  /**
   * This property specifies whether to set the provided namespace as the service connect default in
   * the cluster properties.
   *
   * Default: false
   */
  public fun useForServiceConnect(): Boolean? = unwrap(this).getUseForServiceConnect()

  /**
   * The VPC to associate the namespace with.
   *
   * This property is required for private DNS namespaces.
   *
   * Default: VPC of the cluster for Private DNS Namespace, otherwise none
   */
  public fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)

  /**
   * A builder for [CloudMapNamespaceOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the namespace, such as example.com. 
     */
    public fun name(name: String)

    /**
     * @param type The type of CloudMap Namespace to create.
     */
    public fun type(type: NamespaceType)

    /**
     * @param useForServiceConnect This property specifies whether to set the provided namespace as
     * the service connect default in the cluster properties.
     */
    public fun useForServiceConnect(useForServiceConnect: Boolean)

    /**
     * @param vpc The VPC to associate the namespace with.
     * This property is required for private DNS namespaces.
     */
    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions.Builder =
        software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions.builder()

    /**
     * @param name The name of the namespace, such as example.com. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param type The type of CloudMap Namespace to create.
     */
    override fun type(type: NamespaceType) {
      cdkBuilder.type(type.let(NamespaceType.Companion::unwrap))
    }

    /**
     * @param useForServiceConnect This property specifies whether to set the provided namespace as
     * the service connect default in the cluster properties.
     */
    override fun useForServiceConnect(useForServiceConnect: Boolean) {
      cdkBuilder.useForServiceConnect(useForServiceConnect)
    }

    /**
     * @param vpc The VPC to associate the namespace with.
     * This property is required for private DNS namespaces.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions,
  ) : CdkObject(cdkObject), CloudMapNamespaceOptions {
    /**
     * The name of the namespace, such as example.com.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The type of CloudMap Namespace to create.
     *
     * Default: PrivateDns
     */
    override fun type(): NamespaceType? = unwrap(this).getType()?.let(NamespaceType::wrap)

    /**
     * This property specifies whether to set the provided namespace as the service connect default
     * in the cluster properties.
     *
     * Default: false
     */
    override fun useForServiceConnect(): Boolean? = unwrap(this).getUseForServiceConnect()

    /**
     * The VPC to associate the namespace with.
     *
     * This property is required for private DNS namespaces.
     *
     * Default: VPC of the cluster for Private DNS Namespace, otherwise none
     */
    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CloudMapNamespaceOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions):
        CloudMapNamespaceOptions = CdkObjectWrappers.wrap(cdkObject) as? CloudMapNamespaceOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudMapNamespaceOptions):
        software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.CloudMapNamespaceOptions
  }
}
