@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.s3.assets.AssetOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class CloudFormationTemplate internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate,
) : CdkObject(cdkObject) {
  public open fun bind(arg0: Construct): CloudFormationTemplateConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(CloudFormationTemplateConfig::wrap)

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate,
  ) : CloudFormationTemplate(cdkObject)

  public companion object {
    public fun fromAsset(path: String): CloudFormationTemplate =
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate.fromAsset(path).let(CloudFormationTemplate::wrap)

    public fun fromAsset(path: String, options: AssetOptions): CloudFormationTemplate =
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate.fromAsset(path,
        options.let(AssetOptions::unwrap)).let(CloudFormationTemplate::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c40d613b9b251d5ad7609ae25c41df88c1d5c450cd3ffe2fb4572e96fc442e95")
    public fun fromAsset(path: String, options: AssetOptions.Builder.() -> Unit):
        CloudFormationTemplate = fromAsset(path, AssetOptions(options))

    public fun fromProductStack(productStack: ProductStack): CloudFormationTemplate =
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate.fromProductStack(productStack.let(ProductStack::unwrap)).let(CloudFormationTemplate::wrap)

    public fun fromUrl(url: String): CloudFormationTemplate =
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate.fromUrl(url).let(CloudFormationTemplate::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate):
        CloudFormationTemplate = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFormationTemplate):
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate
  }
}
