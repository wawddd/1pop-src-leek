if (this.phase.get_value(true)) {
                    mc.player.noClip = true;
                    if (mc.gameSettings.keyBindSneak.isKeyDown() || mc.gameSettings.keyBindJump.isKeyDown() || mc.gameSettings.keyBindLeft.isKeyDown() || mc.gameSettings.keyBindRight.isKeyDown() || mc.gameSettings.keyBindSprint.isKeyDown() || mc.gameSettings.keyBindForward.isKeyDown()) {
                        mc.player.motionX = 0.0002;
                    }
                }
