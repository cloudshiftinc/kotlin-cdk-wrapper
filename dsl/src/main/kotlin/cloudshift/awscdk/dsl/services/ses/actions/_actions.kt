@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ses.actions

import software.amazon.awscdk.services.ses.actions.AddHeader
import software.amazon.awscdk.services.ses.actions.AddHeaderProps
import software.amazon.awscdk.services.ses.actions.Bounce
import software.amazon.awscdk.services.ses.actions.BounceProps
import software.amazon.awscdk.services.ses.actions.BounceTemplate
import software.amazon.awscdk.services.ses.actions.BounceTemplateProps
import software.amazon.awscdk.services.ses.actions.Lambda
import software.amazon.awscdk.services.ses.actions.LambdaProps
import software.amazon.awscdk.services.ses.actions.S3
import software.amazon.awscdk.services.ses.actions.S3Props
import software.amazon.awscdk.services.ses.actions.Sns
import software.amazon.awscdk.services.ses.actions.SnsProps
import software.amazon.awscdk.services.ses.actions.Stop
import software.amazon.awscdk.services.ses.actions.StopProps
import kotlin.Unit

public object actions {
    public inline fun addHeader(block: AddHeaderDsl.() -> Unit = {}): AddHeader {
        val builder = AddHeaderDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun addHeaderProps(block: AddHeaderPropsDsl.() -> Unit = {}): AddHeaderProps {
        val builder = AddHeaderPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun bounce(block: BounceDsl.() -> Unit = {}): Bounce {
        val builder = BounceDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun bounceProps(block: BouncePropsDsl.() -> Unit = {}): BounceProps {
        val builder = BouncePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun bounceTemplate(block: BounceTemplateDsl.() -> Unit = {}): BounceTemplate {
        val builder = BounceTemplateDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun bounceTemplateProps(block: BounceTemplatePropsDsl.() -> Unit = {}): BounceTemplateProps {
        val builder = BounceTemplatePropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun lambda(block: LambdaDsl.() -> Unit = {}): Lambda {
        val builder = LambdaDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun lambdaProps(block: LambdaPropsDsl.() -> Unit = {}): LambdaProps {
        val builder = LambdaPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun s3(block: S3Dsl.() -> Unit = {}): S3 {
        val builder = S3Dsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun s3Props(block: S3PropsDsl.() -> Unit = {}): S3Props {
        val builder = S3PropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun sns(block: SnsDsl.() -> Unit = {}): Sns {
        val builder = SnsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun snsProps(block: SnsPropsDsl.() -> Unit = {}): SnsProps {
        val builder = SnsPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun stop(block: StopDsl.() -> Unit = {}): Stop {
        val builder = StopDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun stopProps(block: StopPropsDsl.() -> Unit = {}): StopProps {
        val builder = StopPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
