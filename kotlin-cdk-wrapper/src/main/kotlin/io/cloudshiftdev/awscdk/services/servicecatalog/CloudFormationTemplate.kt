@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.s3.assets.AssetOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Represents the Product Provisioning Artifact Template.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * public class S3BucketProduct extends ProductStack {
 * public S3BucketProduct(Construct scope, String id) {
 * super(scope, id);
 * new Bucket(this, "BucketProduct");
 * }
 * }
 * CloudFormationProduct product = CloudFormationProduct.Builder.create(this, "Product")
 * .productName("My Product")
 * .owner("Product Owner")
 * .productVersions(List.of(CloudFormationProductVersion.builder()
 * .productVersionName("v1")
 * .cloudFormationTemplate(CloudFormationTemplate.fromProductStack(new S3BucketProduct(this,
 * "S3BucketProduct")))
 * .build()))
 * .build();
 * ```
 */
public abstract class CloudFormationTemplate(
  cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate,
) : CdkObject(cdkObject) {
  /**
   * Called when the product is initialized to allow this object to bind to the stack, add resources
   * and have fun.
   *
   * @param scope The binding scope. 
   */
  public open fun bind(scope: Construct): CloudFormationTemplateConfig =
      unwrap(this).bind(scope.let(Construct.Companion::unwrap)).let(CloudFormationTemplateConfig::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate,
  ) : CloudFormationTemplate(cdkObject)

  public companion object {
    public fun fromAsset(path: String): CloudFormationTemplate =
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate.fromAsset(path).let(CloudFormationTemplate::wrap)

    public fun fromAsset(path: String, options: AssetOptions): CloudFormationTemplate =
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate.fromAsset(path,
        options.let(AssetOptions.Companion::unwrap)).let(CloudFormationTemplate::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c40d613b9b251d5ad7609ae25c41df88c1d5c450cd3ffe2fb4572e96fc442e95")
    public fun fromAsset(path: String, options: AssetOptions.Builder.() -> Unit):
        CloudFormationTemplate = fromAsset(path, AssetOptions(options))

    public fun fromProductStack(productStack: ProductStack): CloudFormationTemplate =
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate.fromProductStack(productStack.let(ProductStack.Companion::unwrap)).let(CloudFormationTemplate::wrap)

    public fun fromUrl(url: String): CloudFormationTemplate =
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate.fromUrl(url).let(CloudFormationTemplate::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate):
        CloudFormationTemplate = CdkObjectWrappers.wrap(cdkObject) as? CloudFormationTemplate ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFormationTemplate):
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate
  }
}
