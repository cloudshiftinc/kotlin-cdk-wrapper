package io.cloudshiftdev.awscdk.services.servicecatalog

import io.cloudshiftdev.awscdk.services.s3.assets.AssetOptions
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public abstract class CloudFormationTemplate internal constructor(
  private val cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate,
) {
  public open fun bind(arg0: Construct): CloudFormationTemplateConfig =
      unwrap(this).bind(arg0.let(Construct::unwrap)).let(CloudFormationTemplateConfig::wrap)

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate,
  ) : CloudFormationTemplate(cdkObject)

  public companion object {
    public open fun fromAsset(path: String): CloudFormationTemplate =
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate.fromAsset(path).let(CloudFormationTemplate::wrap)

    public open fun fromAsset(path: String, options: AssetOptions): CloudFormationTemplate =
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate.fromAsset(path,
        options.let(AssetOptions::unwrap)).let(CloudFormationTemplate::wrap)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c40d613b9b251d5ad7609ae25c41df88c1d5c450cd3ffe2fb4572e96fc442e95")
    public open fun fromAsset(path: String, options: AssetOptions.Builder.() -> Unit):
        CloudFormationTemplate = fromAsset(path, AssetOptions(options))

    public open fun fromProductStack(productStack: ProductStack): CloudFormationTemplate =
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate.fromProductStack(productStack.let(ProductStack::unwrap)).let(CloudFormationTemplate::wrap)

    public open fun fromUrl(url: String): CloudFormationTemplate =
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate.fromUrl(url).let(CloudFormationTemplate::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate):
        CloudFormationTemplate = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CloudFormationTemplate):
        software.amazon.awscdk.services.servicecatalog.CloudFormationTemplate = (wrapped as
        Wrapper).cdkObject
  }
}
