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

package cloudshift.awscdk.dsl.services.comprehend

import software.amazon.awscdk.services.comprehend.CfnDocumentClassifier
import software.amazon.awscdk.services.comprehend.CfnDocumentClassifierProps
import software.amazon.awscdk.services.comprehend.CfnFlywheel
import software.amazon.awscdk.services.comprehend.CfnFlywheelProps
import software.constructs.Construct
import kotlin.String
import kotlin.Unit

public object comprehend {
    public inline fun cfnDocumentClassifier(
        scope: Construct,
        id: String,
        block: CfnDocumentClassifierDsl.() -> Unit = {},
    ): CfnDocumentClassifier {
        val builder = CfnDocumentClassifierDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDocumentClassifierAugmentedManifestsListItemProperty(
        block: CfnDocumentClassifierAugmentedManifestsListItemPropertyDsl.() -> Unit =
            {},
    ): CfnDocumentClassifier.AugmentedManifestsListItemProperty {
        val builder = CfnDocumentClassifierAugmentedManifestsListItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDocumentClassifierDocumentClassifierDocumentsProperty(
        block: CfnDocumentClassifierDocumentClassifierDocumentsPropertyDsl.() -> Unit =
            {},
    ): CfnDocumentClassifier.DocumentClassifierDocumentsProperty {
        val builder = CfnDocumentClassifierDocumentClassifierDocumentsPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDocumentClassifierDocumentClassifierInputDataConfigProperty(
        block: CfnDocumentClassifierDocumentClassifierInputDataConfigPropertyDsl.() -> Unit =
            {},
    ): CfnDocumentClassifier.DocumentClassifierInputDataConfigProperty {
        val builder = CfnDocumentClassifierDocumentClassifierInputDataConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDocumentClassifierDocumentClassifierOutputDataConfigProperty(
        block: CfnDocumentClassifierDocumentClassifierOutputDataConfigPropertyDsl.() -> Unit =
            {},
    ): CfnDocumentClassifier.DocumentClassifierOutputDataConfigProperty {
        val builder = CfnDocumentClassifierDocumentClassifierOutputDataConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDocumentClassifierDocumentReaderConfigProperty(
        block: CfnDocumentClassifierDocumentReaderConfigPropertyDsl.() -> Unit =
            {},
    ): CfnDocumentClassifier.DocumentReaderConfigProperty {
        val builder = CfnDocumentClassifierDocumentReaderConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDocumentClassifierProps(
        block: CfnDocumentClassifierPropsDsl.() -> Unit =
            {},
    ): CfnDocumentClassifierProps {
        val builder = CfnDocumentClassifierPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnDocumentClassifierVpcConfigProperty(
        block: CfnDocumentClassifierVpcConfigPropertyDsl.() -> Unit =
            {},
    ): CfnDocumentClassifier.VpcConfigProperty {
        val builder = CfnDocumentClassifierVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlywheel(
        scope: Construct,
        id: String,
        block: CfnFlywheelDsl.() -> Unit = {},
    ): CfnFlywheel {
        val builder = CfnFlywheelDsl(scope, id)
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlywheelDataSecurityConfigProperty(
        block: CfnFlywheelDataSecurityConfigPropertyDsl.() -> Unit =
            {},
    ): CfnFlywheel.DataSecurityConfigProperty {
        val builder = CfnFlywheelDataSecurityConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlywheelDocumentClassificationConfigProperty(
        block: CfnFlywheelDocumentClassificationConfigPropertyDsl.() -> Unit =
            {},
    ): CfnFlywheel.DocumentClassificationConfigProperty {
        val builder = CfnFlywheelDocumentClassificationConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlywheelEntityRecognitionConfigProperty(
        block: CfnFlywheelEntityRecognitionConfigPropertyDsl.() -> Unit =
            {},
    ): CfnFlywheel.EntityRecognitionConfigProperty {
        val builder = CfnFlywheelEntityRecognitionConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlywheelEntityTypesListItemProperty(
        block: CfnFlywheelEntityTypesListItemPropertyDsl.() -> Unit =
            {},
    ): CfnFlywheel.EntityTypesListItemProperty {
        val builder = CfnFlywheelEntityTypesListItemPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlywheelProps(block: CfnFlywheelPropsDsl.() -> Unit = {}): CfnFlywheelProps {
        val builder = CfnFlywheelPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlywheelTaskConfigProperty(
        block: CfnFlywheelTaskConfigPropertyDsl.() -> Unit =
            {},
    ): CfnFlywheel.TaskConfigProperty {
        val builder = CfnFlywheelTaskConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }

    public inline fun cfnFlywheelVpcConfigProperty(
        block: CfnFlywheelVpcConfigPropertyDsl.() -> Unit =
            {},
    ): CfnFlywheel.VpcConfigProperty {
        val builder = CfnFlywheelVpcConfigPropertyDsl()
        builder.apply(block)
        return builder.build()
    }
}
