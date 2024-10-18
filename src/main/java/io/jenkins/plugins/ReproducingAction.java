package io.jenkins.plugins;

import hudson.Extension;
import hudson.model.RootAction;

@Extension
public class ReproducingAction implements RootAction {
    @Override
    public String getIconFileName() {
        return "symbol-alert-circle-outline";
    }

    @Override
    public String getDisplayName() {
        return "reproducer";
    }

    @Override
    public String getUrlName() {
        return "reproducer";
    }
}
