@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.constructs.IConstruct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Manages AWS tags for all resources within a construct scope.
 *
 * Example:
 *
 * ```
 * Mesh mesh;
 * Service service;
 * VirtualNode node = VirtualNode.Builder.create(this, "node")
 * .mesh(mesh)
 * .serviceDiscovery(ServiceDiscovery.cloudMap(service))
 * .listeners(List.of(VirtualNodeListener.http(HttpVirtualNodeListenerOptions.builder()
 * .port(8080)
 * .healthCheck(HealthCheck.http(HttpHealthCheckOptions.builder()
 * .healthyThreshold(3)
 * .interval(Duration.seconds(5))
 * .path("/ping")
 * .timeout(Duration.seconds(2))
 * .unhealthyThreshold(2)
 * .build()))
 * .timeout(HttpTimeout.builder()
 * .idle(Duration.seconds(5))
 * .build())
 * .build())))
 * .backendDefaults(BackendDefaults.builder()
 * .tlsClientPolicy(TlsClientPolicy.builder()
 * .validation(TlsValidation.builder()
 * .trust(TlsValidationTrust.file("/keys/local_cert_chain.pem"))
 * .build())
 * .build())
 * .build())
 * .accessLog(AccessLog.fromFilePath("/dev/stdout"))
 * .build();
 * Tags.of(node).add("Environment", "Dev");
 * ```
 */
public open class Tags(
  cdkObject: software.amazon.awscdk.Tags,
) : CdkObject(cdkObject) {
  /**
   * add tags to the node of a construct and all its the taggable children.
   *
   * @param key 
   * @param value 
   * @param props
   */
  public open fun add(key: String, `value`: String) {
    unwrap(this).add(key, `value`)
  }

  /**
   * add tags to the node of a construct and all its the taggable children.
   *
   * @param key 
   * @param value 
   * @param props
   */
  public open fun add(
    key: String,
    `value`: String,
    props: TagProps,
  ) {
    unwrap(this).add(key, `value`, props.let(TagProps::unwrap))
  }

  /**
   * add tags to the node of a construct and all its the taggable children.
   *
   * @param key 
   * @param value 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0fb2b6735049e77309b6628e7afe52917e02e71708d8f0dd4544dc7d06bf167a")
  public open fun add(
    key: String,
    `value`: String,
    props: TagProps.Builder.() -> Unit,
  ): Unit = add(key, `value`, TagProps(props))

  /**
   * remove tags to the node of a construct and all its the taggable children.
   *
   * @param key 
   * @param props
   */
  public open fun remove(key: String) {
    unwrap(this).remove(key)
  }

  /**
   * remove tags to the node of a construct and all its the taggable children.
   *
   * @param key 
   * @param props
   */
  public open fun remove(key: String, props: TagProps) {
    unwrap(this).remove(key, props.let(TagProps::unwrap))
  }

  /**
   * remove tags to the node of a construct and all its the taggable children.
   *
   * @param key 
   * @param props
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c4742b9a3643d8117e7e8d28b7ae7d4dd2b8b808e1912cff8b393f359321401")
  public open fun remove(key: String, props: TagProps.Builder.() -> Unit): Unit = remove(key,
      TagProps(props))

  public companion object {
    public fun of(scope: IConstruct): Tags =
        software.amazon.awscdk.Tags.of(scope.let(IConstruct::unwrap)).let(Tags::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.Tags): Tags = Tags(cdkObject)

    internal fun unwrap(wrapped: Tags): software.amazon.awscdk.Tags = wrapped.cdkObject as
        software.amazon.awscdk.Tags
  }
}
